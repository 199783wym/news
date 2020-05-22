package news.newsworker.controller;

import news.newsworker.dto.UserClueDTO;
import news.newsworker.model.Iplog;
import news.newsworker.model.User;
import news.newsworker.service.ClueService;
import news.newsworker.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/5/9 12:19
 * @Version 1.0
 */
@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;
    @Autowired
    private ClueService clueService;



    @RequestMapping("/info/{id}")
    public String info(@PathVariable(name = "id") Long id,
                       Model model){
        //个人信息
        User user=infoService.selectInfo(id);
        model.addAttribute("user", user);
        //个人线索信息
        UserClueDTO userClueDTO =clueService.searchUserClue(id);
        model.addAttribute("userClue", userClueDTO);
        //个人登录信息
        List<Iplog> iplogs=infoService.selectIpinfo(id);
        model.addAttribute("iplogs", iplogs);
        return "info";
    }
}
