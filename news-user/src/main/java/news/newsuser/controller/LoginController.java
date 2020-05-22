package news.newsuser.controller;

import news.newsuser.dto.ResultDTO;
import news.newsuser.dto.UserDTO;
import news.newsuser.model.User;
import news.newsuser.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: ym
 * @Date: 2020/3/28 17:03
 * @Version 1.0
 */


@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String index(){
        return "hello";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam(value = "username",required =false)String username,
            @RequestParam(value = "password",required =false)String password,
            HttpServletRequest request,
            HttpServletResponse response,
            Model model

    ) throws NoSuchAlgorithmException {

        boolean flag = loginService.isUser(username, DigestUtils.md5DigestAsHex(password.getBytes()));
        if(flag){
            response.addCookie(new Cookie("username",username));
            String ip = request.getRemoteAddr();
            loginService.addIplog(ip,username);
            return "redirect:/publish";
        }else{
            model.addAttribute("error", "登录错误");
            return "error";
        }

    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request,
                         HttpServletResponse response) {
        request.getSession().removeAttribute("user");
        Cookie cookie = new Cookie("username", null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return "redirect:/";
    }

    @ResponseBody
    @PostMapping("/register")
    public Object register(@RequestBody UserDTO userDTO,
                           HttpServletRequest request){
        User user =new User();
        user.setName(userDTO.getUsername());
        user.setPasswordMd5(DigestUtils.md5DigestAsHex(userDTO.getPassword().getBytes()));
        user.setPhone(userDTO.getPhone());
        user.setGmtCreate(System.currentTimeMillis());
        user.setGmtModified(System.currentTimeMillis());
        user.setScore(0L);
        loginService.register(user);
        return ResultDTO.okOf();
    }
}
