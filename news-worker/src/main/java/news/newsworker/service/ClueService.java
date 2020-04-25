package news.newsworker.service;
import	java.awt.print.Book;
import	java.security.KeyStore.Entry.Attribute;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import news.newsworker.dto.ClueDTO;
import news.newsworker.mapper.ClueMapper;
import news.newsworker.mapper.DictionaryMapper;
import news.newsworker.mapper.UserMapper;
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

    public PageInfo<ClueDTO> selectClue(Clue clue) {

        ClueExample clueExample = new ClueExample();
        PageHelper.startPage(2, 5);
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
}
