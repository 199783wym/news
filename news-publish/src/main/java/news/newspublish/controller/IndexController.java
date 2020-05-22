package news.newspublish.controller;

import com.github.pagehelper.PageInfo;
import news.newspublish.dto.ClueDTO;
import news.newspublish.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ym
 * @Date: 2020/5/22 21:09
 * @Version 1.0
 */
@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;
    @RequestMapping("/")
    public String  index(Model model,
                         @RequestParam(name = "page", defaultValue = "1") Integer page,
                         @RequestParam(name = "size", defaultValue = "5") Integer size){
        PageInfo<ClueDTO> cluePageInfo=indexService.selectAll(page,size);
        model.addAttribute("cluePageInfo",cluePageInfo);
        return "index";
    }
}
