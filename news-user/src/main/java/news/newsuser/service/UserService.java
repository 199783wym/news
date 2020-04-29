package news.newsuser.service;

import news.newsuser.mapper.UserMapper;
import news.newsuser.model.User;
import news.newsuser.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ym
 * @Date: 2020/4/29 0:56
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User selectInfo() {
        return userMapper.selectByPrimaryKey(UserContext.getLoginInfo().getId());
    }

}
