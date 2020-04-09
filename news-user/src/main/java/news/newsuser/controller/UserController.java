package news.newsuser.controller;

import com.github.pagehelper.PageInfo;
import news.newsuser.model.Clue;
import news.newsuser.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ym
 * @Date: 2020/4/8 1:24
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private ClueService clueService;


    @GetMapping(value="myclue")
    public String myClue(Model model,
                         @RequestParam(name = "page", defaultValue = "1") Integer page,
                         @RequestParam(name = "size", defaultValue = "5") Integer size){
        PageInfo<Clue> cluePageInfo = clueService.selectAll(page, size);
        model.addAttribute("cluePageInfo",cluePageInfo);
        return "myclue";
    }
}
