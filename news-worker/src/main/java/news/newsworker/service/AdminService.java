package news.newsworker.service;

import news.newsworker.mapper.AdminMapper;
import news.newsworker.model.Admin;
import news.newsworker.model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/5/23 0:27
 * @Version 1.0
 */
@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;
    public List<Admin> selectSuperAdmin() {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminClassEqualTo(2L);
        return adminMapper.selectByExample(adminExample);
    }
}
