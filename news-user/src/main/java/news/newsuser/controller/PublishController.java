package news.newsuser.controller;

import news.newsuser.mapper.DictionaryMapper;
import news.newsuser.model.Dictionary;
import news.newsuser.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2020/4/5 23:12
 * @Version 1.0
 */
@Controller
public class PublishController {
    @Autowired
    private PublishService publishService;


    @GetMapping(value="/publish")
    public String toPublish(Model model){
        //查字典
        List<Dictionary> clueTypes= publishService.search(1L);
        model.addAttribute("ClueTypes", clueTypes);
        return "publish";
    }
}
