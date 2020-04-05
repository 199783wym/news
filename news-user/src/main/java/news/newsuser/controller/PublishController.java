package news.newsuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: ym
 * @Date: 2020/4/5 23:12
 * @Version 1.0
 */
@Controller
public class PublishController {

    @GetMapping(value="/publish")
    public String toPublish(){
        return "publish";
    }
}
