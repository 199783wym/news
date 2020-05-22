package news.newsworker.controller;
import news.newsworker.dto.RequestDTO;
import news.newsworker.dto.ResultDTO;
import news.newsworker.model.Renzheng;
import news.newsworker.service.RenzhengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import	java.awt.Container;

/**
 * @Author: ym
 * @Date: 2020/5/12 19:58
 * @Version 1.0
 */
@Controller
public class RenzhengController {
    @Autowired
    private RenzhengService renzhengService;

    @RequestMapping("/renzhengList")
    public String list(Model model){

        model.addAttribute("renzhengList",renzhengService.selectAll());
        return "renzheng";
    }
    /**上传地址*/
    @Value("${file.upload.path}")
    private String filePath;
    /**显示相对地址*/
    @Value("${file.upload.path.relative}")
    private String fileRelativePath;

    @RequestMapping("/renzheng/{id}")
    public String renzheng(@PathVariable(name = "id") Long id,
            Model model){
        Renzheng renzheng = renzhengService.select(id);
        model.addAttribute("renzheng", renzheng);
        model.addAttribute("filename","/images/"+renzheng.getImg());

        return "renzhengPage";
    }

    @ResponseBody
    @RequestMapping("/renzhengPass")
    public Object pass(@RequestBody RequestDTO requestDTO,
                       HttpServletRequest request){
        renzhengService.pass(requestDTO.getClueId());
        return ResultDTO.okOf();
    }
}
