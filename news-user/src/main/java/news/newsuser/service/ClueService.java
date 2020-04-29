package news.newsuser.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import news.newsuser.dto.UserClueDTO;
import news.newsuser.mapper.ClueMapper;
import news.newsuser.model.Clue;
import news.newsuser.model.ClueExample;
import news.newsuser.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/4/8 2:27
 * @Version 1.0
 */
@Service
public class ClueService {
    @Autowired
    private ClueMapper clueMapper;


    public PageInfo<Clue> selectAll(Integer page, Integer size) {
        PageHelper.startPage(page,size);//这行是重点，表示从pageNum页开始，每页pageSize条数据
        ClueExample clueExample = new ClueExample();
        clueExample.createCriteria().andCreateIdEqualTo(UserContext.getLoginInfo().getId());
        List<Clue> list = clueMapper.selectByExample(clueExample);
        PageInfo<Clue> pageInfo = new PageInfo<Clue>(list);
        return pageInfo;
    }

    public UserClueDTO searchUserClue() {
        UserClueDTO userClueDTO =new UserClueDTO();
        ClueExample clueExample = new ClueExample();
        clueExample.createCriteria().andCreateIdEqualTo(UserContext.getLoginInfo().getId());
        userClueDTO.setTotalCount(clueMapper.countByExample(clueExample));
        ClueExample clueExample2 = new ClueExample();
        clueExample2.createCriteria().andCreateIdEqualTo(UserContext.getLoginInfo().getId()).andStatusEqualTo(4L);
        userClueDTO.setSuccessCount(clueMapper.countByExample(clueExample2));
        return userClueDTO;
    }
}
