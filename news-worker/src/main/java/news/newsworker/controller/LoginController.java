package news.newsworker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    ) throws NoSuchAlgorithmException {
        System.out.println(username+password);
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        // java自带工具包MessageDigest
////        String resultString = MD5Utils.md5("123456");
//        System.out.println(resultString);
//        // e10adc3949ba59abbe56e057f20f883e
//        String resultString1 = MD5Utils.md5("1234");
//        System.out.println(resultString1);
//        //81dc9bdb52d04dc20036dbd8313ed055
//
//        // spring自带工具包DigestUtils
        System.out.println(DigestUtils.md5DigestAsHex("1234".getBytes()));
       return "index";
    }

}
