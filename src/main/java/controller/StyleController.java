package controller;

import model.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StyleService;
import vo.Error;
import vo.RestResult;

/**
 * Created by DengrongGuan on 2016/7/27.
 */
@Controller
@RequestMapping("/v1/styles")
public class StyleController {
    @Autowired
    private StyleService styleService;

    @RequestMapping("designadd")
    public String designAdd() { return "design/design_add"; }

    @RequestMapping("designlist")
    public String designList() { return "design/design_list"; }

    @RequestMapping("designdetail")
    public String designDetail() { return "design/design_detail"; }


    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public RestResult post(@ModelAttribute("style")Style style,String materials){
        return styleService.addStyle(style,materials);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public RestResult get(Integer page,Integer num,String operation,String key,String field){
        return styleService.searchStyles(page,num,operation,key,field);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public RestResult put(@ModelAttribute("style")Style style){
        return styleService.updateStyle(style);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public RestResult delete(Integer id){
        return styleService.deleteStyle(id);
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    @ResponseBody
    public RestResult detail(Integer id){
        return styleService.getDetail(id);
    }
}
