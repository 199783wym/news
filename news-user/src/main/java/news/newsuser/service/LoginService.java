package news.newsuser.service;

import news.newsuser.mapper.UserMapper;
import news.newsuser.model.User;
import news.newsuser.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/3/25 15:59
 * @Version 1.0
 */
@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    public boolean isUser(String username ,String password){
        UserExample userExample =new UserExample();
        userExample.createCriteria()
                .andNameEqualTo(username);
        List<User> admins = userMapper.selectByExample(userExample);
        if(admins.size()!=1){
            return false;
        }else{
            User admin = admins.get(0);
            if (password.equals(admin.getPassword()) ) {
                return true;
            }
            return false;
        }



    }

    public void register(User user) {
        userMapper.insert(user);
    }
}
