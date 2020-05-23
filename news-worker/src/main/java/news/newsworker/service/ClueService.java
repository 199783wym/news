package news.newsworker.service;
import	java.awt.print.Book;
import	java.security.KeyStore.Entry.Attribute;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import news.newsworker.dto.ClueDTO;
import news.newsworker.dto.ClueInfoDTO;
import news.newsworker.dto.SuperAdminDTO;
import news.newsworker.dto.UserClueDTO;
import news.newsworker.mapper.*;
import news.newsworker.model.*;
import news.newsworker.util.UserContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/4/14 23:03
 * @Version 1.0
 */
@Service
public class ClueService {

    @Autowired
    private DictionaryMapper dictionaryMapper;
    @Autowired
    private ClueMapper clueMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private NewsMapper newsMapper;

    public PageInfo<ClueDTO> selectClue(Clue clue,Integer page,Integer size) {

        ClueExample clueExample = new ClueExample();
        clueExample.setOrderByClause("gmt_create desc");
        PageHelper.startPage(page, size);
        List<Clue> list = clueMapper.selectByExample(clueExample);
        List<ClueDTO> clueDTOS = new ArrayList<>();
        PageInfo<Clue> befPageInfo = new PageInfo<Clue>(list);
        for(Clue clue1:list){
            User user = userMapper.selectByPrimaryKey(clue1.getCreateId());
            ClueDTO clueDTO =new ClueDTO();
            BeanUtils.copyProperties(clue1, clueDTO);
            clueDTO.setUser(user);
            clueDTOS.add(clueDTO);
        }
        PageInfo<ClueDTO> pageInfo = new PageInfo<ClueDTO>();
        BeanUtils.copyProperties(befPageInfo,pageInfo);
        pageInfo.setList(clueDTOS);
        return pageInfo;
    }

    public List<Dictionary> search(Long type) {
        DictionaryExample dictionaryExample = new DictionaryExample();
        dictionaryExample.createCriteria().andTypeEqualTo(type);
        return dictionaryMapper.selectByExample(dictionaryExample);
    }

    public Dictionary search(String type) {
        DictionaryExample dictionaryExample = new DictionaryExample();
        dictionaryExample.createCriteria().andNameEqualTo(type);
        List<Dictionary> dictionaries = dictionaryMapper.selectByExample(dictionaryExample);
        if (dictionaries == null) {
            return null;
        } else {
            return dictionaries.get(0);
        }
    }

    public ClueDTO getById(Long id) {
        Clue clue = clueMapper.selectByPrimaryKey(id);
        ClueDTO clueDTO=new ClueDTO();
        User user = userMapper.selectByPrimaryKey(clue.getCreateId());
        BeanUtils.copyProperties(clue,clueDTO);
        clueDTO.setUser(user);
        return clueDTO;
    }

    public void pass1(Long clueId) {
        Clue updateClue =new Clue();
        updateClue.setStatus(1L);
        updateClue.setAudit1(1L);
        updateClue.setAudit1No(UserContext.getLoginInfo().getId());
        ClueExample clueExample=new ClueExample();
        clueExample.createCriteria()
                .andIdEqualTo(clueId);
        clueMapper.updateByExampleSelective(updateClue, clueExample);
    }

    public void nopass(Long clueId) {
        Clue updateClue =new Clue();
        updateClue.setStatus(4L);
        updateClue.setReturnNo(UserContext.getLoginInfo().getId());
        ClueExample clueExample=new ClueExample();
        clueExample.createCriteria()
                .andIdEqualTo(clueId);
        clueMapper.updateByExampleSelective(updateClue, clueExample);

    }

    public UserClueDTO searchUserClue(Long id) {
        UserClueDTO userClueDTO =new UserClueDTO();
        ClueExample clueExample = new ClueExample();
        clueExample.createCriteria().andCreateIdEqualTo(id);
        userClueDTO.setTotalCount(clueMapper.countByExample(clueExample));
        ClueExample clueExample2 = new ClueExample();
        clueExample2.createCriteria().andCreateIdEqualTo(id).andStatusEqualTo(4L);
        userClueDTO.setSuccessCount(clueMapper.countByExample(clueExample2));
        return userClueDTO;
    }

    public void pass2(Long clueId) {
        Clue updateClue =new Clue();
        updateClue.setStatus(2L);
        updateClue.setAudit2(1L);
        updateClue.setAudit2No(UserContext.getLoginInfo().getId());
        ClueExample clueExample=new ClueExample();
        clueExample.createCriteria()
                .andIdEqualTo(clueId);
        clueMapper.updateByExampleSelective(updateClue, clueExample);
    }

    public void publish(Long clueId) {
        Clue updateClue =new Clue();
        updateClue.setStatus(3L);
        ClueExample clueExample=new ClueExample();
        clueExample.createCriteria()
                .andIdEqualTo(clueId);
        clueMapper.updateByExampleSelective(updateClue, clueExample);
    }

    public void updateAduit(SuperAdminDTO superAdminDTO) {
        //先查该名字的id
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(superAdminDTO.getSuperAdminId());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        Admin admin = admins.get(0);
        //更新至线索中
        Clue clue = clueMapper.selectByPrimaryKey(superAdminDTO.getClueId());
        clue.setToId(admin.getId());
        clueMapper.updateByPrimaryKeySelective(clue);
    }

    public PageInfo<ClueDTO> selectClueAduit(Clue clue, Integer page, Integer size) {
        ClueExample clueExample = new ClueExample();
        clueExample.setOrderByClause("gmt_create desc");
        clueExample.createCriteria().andToIdEqualTo(UserContext.getLoginInfo().getId());
        PageHelper.startPage(page, size);
        List<Clue> list = clueMapper.selectByExample(clueExample);
        List<ClueDTO> clueDTOS = new ArrayList<>();
        PageInfo<Clue> befPageInfo = new PageInfo<Clue>(list);
        for(Clue clue1:list){
            User user = userMapper.selectByPrimaryKey(clue1.getCreateId());
            ClueDTO clueDTO =new ClueDTO();
            BeanUtils.copyProperties(clue1, clueDTO);
            clueDTO.setUser(user);
            clueDTOS.add(clueDTO);
        }
        PageInfo<ClueDTO> pageInfo = new PageInfo<ClueDTO>();
        BeanUtils.copyProperties(befPageInfo,pageInfo);
        pageInfo.setList(clueDTOS);
        return pageInfo;
    }

    public ClueInfoDTO selectClueInfo() {
        ClueInfoDTO clueInfoDTO=new ClueInfoDTO();
        //待审总数
        ClueExample clueExample1 = new ClueExample();
        clueExample1.createCriteria().andStatusBetween(0L,2L);
        clueInfoDTO.setToAuditCount(clueMapper.countByExample(clueExample1));
        //发布总数
        ClueExample clueExample2 = new ClueExample();
        clueExample2.createCriteria().andStatusEqualTo(3L);
        clueInfoDTO.setPublicCount(clueMapper.countByExample(clueExample2));
        //新闻稿总数
        NewsExample newsExample= new NewsExample();
        clueInfoDTO.setNewsCount(newsMapper.countByExample(newsExample));
        return  clueInfoDTO;
    }
}
