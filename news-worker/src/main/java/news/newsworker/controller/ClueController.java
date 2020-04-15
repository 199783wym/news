package news.newsworker.controller;
import	java.net.Authenticator;

import news.newsworker.model.Clue;
import news.newsworker.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: ym
 * @Date: 2020/4/14 22:51
 * @Version 1.0
 */
@Controller
public class ClueController {
    @Autowired
    private ClueService clueService;

    @PostMapping("/clue")
    public String clue(){
        Clue clue = new Clue();
        clueService.selectClue(clue);
        return "clue";
    }
}
