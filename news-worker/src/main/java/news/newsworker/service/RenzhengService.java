package news.newsworker.service;
import	java.awt.Desktop.Action;

import news.newsworker.mapper.RenzhengMapper;
import news.newsworker.mapper.UserMapper;
import news.newsworker.model.Renzheng;
import news.newsworker.model.RenzhengExample;
import news.newsworker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/5/15 5:48
 * @Version 1.0
 */
@Service
public class RenzhengService {
    @Autowired
    private RenzhengMapper renzhengMapper;
    @Autowired
    private UserMapper userMapper;

    public List<Renzheng> selectAll() {
        RenzhengExample example = new RenzhengExample();
        example.setOrderByClause("gmt_create desc");
        return renzhengMapper.selectByExample(example);
    }

    public Renzheng select(Long id) {
        RenzhengExample example = new RenzhengExample();
        example.createCriteria().andIdEqualTo(id);
        List<Renzheng> renzhengs = renzhengMapper.selectByExample(example);
        Renzheng renzheng = renzhengs.get(0);
        return renzheng;
    }

    public void pass(Long Id) {
        Renzheng renzheng= new Renzheng();
        renzheng.setStatus(0L);
        RenzhengExample example = new RenzhengExample();
        example.createCriteria().andIdEqualTo(Id);
        renzhengMapper.updateByExampleSelective(renzheng, example);
        Renzheng renzheng1 = renzhengMapper.selectByPrimaryKey(Id);
        User user = userMapper.selectByPrimaryKey(renzheng1.getUserId());
        user.setRenzheng(1L);
        user.setRenzhengString(renzheng1.getName());
        userMapper.updateByPrimaryKeySelective(user);
    }
}
