package news.newsworker.service;

import news.newsworker.mapper.IplogMapper;
import news.newsworker.mapper.UserMapper;
import news.newsworker.model.Iplog;
import news.newsworker.model.IplogExample;
import news.newsworker.model.User;
import news.newsworker.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/5/9 12:21
 * @Version 1.0
 */
@Service
public class InfoService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IplogMapper iplogMapper;

    public User selectInfo(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<Iplog> selectIpinfo(Long id) {
        IplogExample example = new IplogExample();
        example.createCriteria().andUserIdEqualTo(id);
        return iplogMapper.selectByExample(example);
    }
}
