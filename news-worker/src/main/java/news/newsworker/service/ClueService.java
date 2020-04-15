package news.newsworker.service;

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
    public List<Clue> selectClue(Clue clue) {
        ClueExample clueExample=new ClueExample();
        clueExample.createCriteria();
        List<Clue> clues = clueMapper.selectByExample(clueExample);
        return clues;
    }
}
