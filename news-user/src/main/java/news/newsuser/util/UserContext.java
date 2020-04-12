package news.newsuser.util;

import news.newsuser.model.User;
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
    public static User getLoginInfo() {

        return (User) getSession().getAttribute(USER_IN_SESSION);
    }
}
