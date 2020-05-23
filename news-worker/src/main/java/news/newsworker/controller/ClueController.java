package news.newsworker.controller;
import	java.net.Authenticator;
import java.util.List;

import com.github.pagehelper.PageInfo;
import news.newsworker.dto.*;
import news.newsworker.mapper.AdminMapper;
import news.newsworker.model.Clue;
import news.newsworker.model.Dictionary;
import news.newsworker.service.AdminService;
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
    @Autowired
    private AdminService adminService;

    @RequestMapping("/clue")
    public String clue(Model model,
                       @RequestParam(name = "page", defaultValue = "1") Integer page,
                       @RequestParam(name = "size", defaultValue = "5") Integer size){
        //查字典
        List<Dictionary> clueTypes= clueService.search(1L);
        model.addAttribute("ClueTypes", clueTypes);
        //查所有线索
        Clue clue = new Clue();
        PageInfo<ClueDTO> cluePageInfo=clueService.selectClue(clue,page,size);
        model.addAttribute("cluePageInfo",cluePageInfo);
        //查工作台
        ClueInfoDTO clueInfoDTO = clueService.selectClueInfo();
        model.addAttribute("clueInfo", clueInfoDTO);

        return "clue";
    }

    @GetMapping("/clue/{id}")
    public String edit(@PathVariable(name = "id") Long id,
                       Model model) {
        ClueDTO clue = clueService.getById(id);
        model.addAttribute("clue", clue);

        //查高级管理员
        model.addAttribute("superAdmins", adminService.selectSuperAdmin());
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

    @ResponseBody
    @RequestMapping("/toSuperAdmin")
    public Object toSuperAdmin(@RequestBody SuperAdminDTO superAdminDTO,
                              HttpServletRequest request){
        clueService.updateAduit(superAdminDTO);
        return ResultDTO.okOf();
    }

    @RequestMapping("/toAudit")
    public String aduit(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size){
        //查字典
        List<Dictionary> clueTypes= clueService.search(1L);
        model.addAttribute("ClueTypes", clueTypes);

        Clue clue = new Clue();
        PageInfo<ClueDTO> cluePageInfo=clueService.selectClueAduit(clue,page,size);
        model.addAttribute("cluePageInfo",cluePageInfo);
        return "toAduit";
    }


}
