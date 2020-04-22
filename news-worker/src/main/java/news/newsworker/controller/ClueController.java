package news.newsworker.controller;
import	java.net.Authenticator;
import java.util.List;

import com.github.pagehelper.PageInfo;
import news.newsworker.model.Clue;
import news.newsworker.model.Dictionary;
import news.newsworker.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/clue")
    public String clue(Model model){
        //查字典
        List<Dictionary> clueTypes= clueService.search(1L);
        model.addAttribute("ClueTypes", clueTypes);

        Clue clue = new Clue();
        PageInfo<Clue> cluePageInfo=clueService.selectClue(clue);
        model.addAttribute("cluePageInfo",cluePageInfo);
        return "clue";
    }
}
