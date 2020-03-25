package news.newsworker.interceptor;

import news.newsworker.mapper.AdminMapper;
import news.newsworker.model.Admin;
import news.newsworker.model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/3/26 2:30
 * @Version 1.0
 */
@Service
public class SessionInterceptor implements HandlerInterceptor {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    String username = cookie.getValue();
                    AdminExample userExample = new AdminExample();
                    userExample.createCriteria()
                            .andUsernameEqualTo(username);
                    List<Admin> users = adminMapper.selectByExample(userExample);

                    if (users.size() != 0) {
                        request.getSession().setAttribute("user", users.get(0));
                    }
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
