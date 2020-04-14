package news.newsworker.util;

import news.newsworker.model.Admin;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: ym
 * @Date: 2020/4/12 23:31
 * @Version 1.0
 */
public class UserContext {
    public static final String USER_IN_SESSION = "user";


    private static HttpSession getSession() {
        ServletRequestAttributes threadAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = threadAttributes.getRequest();
        HttpSession session = request.getSession();
        return session;
    }
    public static Admin getLoginInfo() {

        return (Admin) getSession().getAttribute(USER_IN_SESSION);
    }
}
