package news.newsuser.controller;

import news.newsuser.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String myClue(){
        clueService.selectAll();
        return "myclue";
    }
}
