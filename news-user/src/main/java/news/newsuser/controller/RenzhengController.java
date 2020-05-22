package news.newsuser.controller;

import news.newsuser.dto.RenzhengDTO;
import news.newsuser.dto.ResultDTO;
import news.newsuser.service.RenzhengService;
import news.newsuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: ym
 * @Date: 2020/5/8 13:50
 * @Version 1.0
 */
@Controller
public class RenzhengController {
    @Autowired
    private UserService userService;
    @Autowired
    private RenzhengService renzhengService;

    @RequestMapping("/renzheng")
    public String renzheng(Model model){

        return "renzheng";
    }

    @RequestMapping("/toRenzheng")
    @ResponseBody
    public Object toRenzheng(@RequestParam(value="file",required=false) MultipartFile file,
                             @RequestParam(value="title",required=false) String title,
                             Model model){
        System.out.println(file+title);
        //提交申请
        renzhengService.insert(file, title);
        //该状态
        userService.updateRenzhengStatus();
        return ResultDTO.okOf();
    }
}
