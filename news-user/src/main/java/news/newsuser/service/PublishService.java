package news.newsuser.service;

import news.newsuser.mapper.DictionaryMapper;
import news.newsuser.model.Dictionary;
import news.newsuser.model.DictionaryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/4/6 23:35
 * @Version 1.0
 */
@Service
public class PublishService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

    public List<Dictionary> search(Long type){
        DictionaryExample dictionaryExample=new DictionaryExample();
        dictionaryExample.createCriteria().andTypeEqualTo(type);
        return dictionaryMapper.selectByExample(dictionaryExample);
    }

    public Dictionary search(String type) {
        DictionaryExample dictionaryExample=new DictionaryExample();
        dictionaryExample.createCriteria().andNameEqualTo(type);
        List<Dictionary> dictionaries = dictionaryMapper.selectByExample(dictionaryExample);
        if (dictionaries == null) {
            return null;
        }else{
            return dictionaries.get(0);
        }
    }
}
