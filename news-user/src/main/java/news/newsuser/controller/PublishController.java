package news.newsuser.controller;

import news.newsuser.mapper.DictionaryMapper;
import news.newsuser.model.Clue;
import news.newsuser.model.Dictionary;
import news.newsuser.model.User;
import news.newsuser.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
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

    @PostMapping("/publish")
    public String doPublish(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "description", required = false) String description,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "id", required = false) Long id,
            HttpServletRequest request,
            Model model) {
        //查字典
        List<Dictionary> clueTypes= publishService.search(1L);
        model.addAttribute("ClueTypes", clueTypes);

        model.addAttribute("title", title);
        model.addAttribute("description", description);
        model.addAttribute("type", type);

        if (title == null || title == "") {
            model.addAttribute("error", "标题不能为空");
            return "redirect:/publish";
        }
        if (description == null || description == "") {
            model.addAttribute("error", "内容不能为空");
            return "redirect:/publish";
        }
        if (type == null || type == "") {
            model.addAttribute("error", "类型不能为空");
            return "redirect:/publish";
        }
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            model.addAttribute("error", "用户未登录");
            return "redirect:/publish";
        }
//        Question question = new Question();
//        question.setTitle(title);
//        question.setDescription(description);
//        question.setTag(tag);
//        question.setCreator(user.getId());
//        question.setId(id);
//        questionService.createOrUpdate(question);
        //根据type值 查出id
        Dictionary typeClass = publishService.search(type);

        Clue clue=new Clue();
        clue.setId(id);
        clue.set
        return "redirect:/";
    }
}
