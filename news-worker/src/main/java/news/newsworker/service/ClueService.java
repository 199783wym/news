package news.newsworker.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import news.newsworker.mapper.ClueMapper;
import news.newsworker.model.Clue;
import news.newsworker.model.ClueExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/4/14 23:03
 * @Version 1.0
 */
@Service
public class ClueService {

    @Autowired
    private ClueMapper clueMapper;
    public PageInfo<Clue> selectClue(Clue clue) {
        PageHelper.startPage(1,5);
        ClueExample clueExample=new ClueExample();
        List<Clue> list = clueMapper.selectByExample(clueExample);
        PageInfo<Clue> pageInfo = new PageInfo<Clue>(list);
        return pageInfo;
    }
}
