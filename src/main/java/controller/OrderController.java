package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DengrongGuan on 2016/8/13.
 */
@Controller
@RequestMapping("/v1/order")
public class OrderController {

    @RequestMapping("orderadd")
    public String materialAdd(){
        return "order/order_add";
    }
}
