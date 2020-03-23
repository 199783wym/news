package news.newsworker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ym
 * @Date: 2020/3/19 10:34
 * @Version 1.0
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model){
        model.addAttribute("name", name);
        return "hello";


    }
}
