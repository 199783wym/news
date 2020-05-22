package news.newspublish.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import news.newspublish.dto.ClueDTO;
import news.newspublish.mapper.ClueMapper;
import news.newspublish.mapper.UserMapper;
import news.newspublish.model.Clue;
import news.newspublish.model.ClueExample;
import news.newspublish.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/5/22 21:09
 * @Version 1.0
 */
@Service
public class IndexService {
    @Autowired
    private ClueMapper clueMapper;
    @Autowired
    private UserMapper userMapper;
    public PageInfo<ClueDTO> selectAll(Integer page,Integer size) {
        ClueExample clueExample = new ClueExample();
        clueExample.createCriteria().andStatusEqualTo(3L);
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
}
