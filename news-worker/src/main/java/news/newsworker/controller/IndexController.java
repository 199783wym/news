package news.newsworker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ym
 * @Date: 2020/3/23 18:31
 * @Version 1.0
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(){
        return "index";


    }
}
