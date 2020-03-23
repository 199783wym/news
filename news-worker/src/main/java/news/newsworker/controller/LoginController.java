package news.newsworker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ym
 * @Date: 2020/3/23 19:20
 * @Version 1.0
 */
@Controller
public class LoginController {
    @PostMapping("/login")
    public String login(
            @RequestParam(value = "username",required =false)String username,
            @RequestParam(value = "password",required =false)String password,
            HttpServletRequest request,
            Model model
    ){
        System.out.println(username+password);
       return "index";
    }

}
