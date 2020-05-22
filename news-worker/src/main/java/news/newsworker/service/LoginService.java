package news.newsworker.service;

import news.newsworker.mapper.AdminMapper;
import news.newsworker.mapper.IplogMapper;
import news.newsworker.model.Admin;
import news.newsworker.model.AdminExample;
import news.newsworker.model.Iplog;
import news.newsworker.util.UserContext;
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
    private AdminMapper adminMapper;
    @Autowired
    private IplogMapper iplogMapper;

    public boolean isAdmin(String username ,String password){
        AdminExample adminExample =new AdminExample();
        adminExample.createCriteria()
                .andUsernameEqualTo(username);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if(admins.size()!=1){
            return false;
        }else{
            Admin admin = admins.get(0);
            if (password.equals(admin.getPassword()) ) {
                return true;
            }
            return false;
        }
    }


}
