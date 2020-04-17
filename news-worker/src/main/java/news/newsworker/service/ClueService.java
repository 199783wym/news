package news.newsworker.service;
import	java.security.KeyStore.Entry.Attribute;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import news.newsworker.mapper.ClueMapper;
import news.newsworker.mapper.DictionaryMapper;
import news.newsworker.model.Clue;
import news.newsworker.model.ClueExample;
import news.newsworker.model.Dictionary;
import news.newsworker.model.DictionaryExample;
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
    private DictionaryMapper dictionaryMapper;
    @Autowired
    private ClueMapper clueMapper;

    public PageInfo<Clue> selectClue(Clue clue) {
        PageHelper.startPage(2, 5);
        ClueExample clueExample = new ClueExample();
        List<Clue> list = clueMapper.selectByExample(clueExample);
        PageInfo<Clue> pageInfo = new PageInfo<Clue>(list);
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
}
