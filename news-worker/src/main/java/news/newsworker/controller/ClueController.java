package news.newsworker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: ym
 * @Date: 2020/4/14 22:51
 * @Version 1.0
 */
@Controller
public class ClueController {

    @PostMapping("/clue")
    public String clue(){

        return "clue";
    }
}
