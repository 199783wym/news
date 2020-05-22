package news.newsworker.controller;
import	java.net.Authenticator;
import java.util.List;

import com.github.pagehelper.PageInfo;
import news.newsworker.dto.ClueDTO;
import news.newsworker.dto.RequestDTO;
import news.newsworker.dto.ResultDTO;
import news.newsworker.model.Clue;
import news.newsworker.model.Dictionary;
import news.newsworker.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ym
 * @Date: 2020/4/14 22:51
 * @Version 1.0
 */
@Controller
public class ClueController {
    @Autowired
    private ClueService clueService;

    @RequestMapping("/clue")
    public String clue(Model model,
                       @RequestParam(name = "page", defaultValue = "1") Integer page,
                       @RequestParam(name = "size", defaultValue = "5") Integer size){
        //查字典
        List<Dictionary> clueTypes= clueService.search(1L);
        model.addAttribute("ClueTypes", clueTypes);

        Clue clue = new Clue();
        PageInfo<ClueDTO> cluePageInfo=clueService.selectClue(clue,page,size);
        model.addAttribute("cluePageInfo",cluePageInfo);
        return "clue";
    }

    @GetMapping("/clue/{id}")
    public String edit(@PathVariable(name = "id") Long id,
                       Model model) {
        ClueDTO clue = clueService.getById(id);
        model.addAttribute("clue", clue);
//        model.addAttribute("title", clue.getTitle());
//        model.addAttribute("description", question.getDescription());
//        model.addAttribute("tag", question.getTag());
//        model.addAttribute("id", question.getId());
        return "cluePage";
    }

    @ResponseBody
    @RequestMapping("/pass")
    public Object pass(@RequestBody RequestDTO requestDTO,
                       HttpServletRequest request){
        clueService.pass1(requestDTO.getClueId());
        return ResultDTO.okOf();
    }

    @ResponseBody
    @RequestMapping("/pass2")
    public Object pass2(@RequestBody RequestDTO requestDTO,
                       HttpServletRequest request){
        clueService.pass2(requestDTO.getClueId());
        return ResultDTO.okOf();
    }

    @ResponseBody
    @RequestMapping("/nopass")
    public Object nopass(@RequestBody RequestDTO requestDTO,
                       HttpServletRequest request){
        clueService.nopass(requestDTO.getClueId());
        return ResultDTO.okOf();
    }

    @ResponseBody
    @RequestMapping("/publishClue")
    public Object publishClue(@RequestBody RequestDTO requestDTO,
                        HttpServletRequest request){
        clueService.publish(requestDTO.getClueId());
        return ResultDTO.okOf();
    }

}
