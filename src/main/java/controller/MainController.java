package controller;

import model.Role;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;
import vo.RestResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by I322233 on 6/23/2016.
 */
@Controller
@RequestMapping("main")
public class MainController {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("MarK");
        u.setUserrole(Role.EMPLOYEE);
        us.add(u);
        u = new User();
        u.setUsername("Fawofolo");
        us.add(u);
        u.setUserrole(Role.EMPLOYER);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("materialadd")
    public String materialAdd(){
        return "material/material_add";
    }

    @RequestMapping("materialquery")
    public String materialQuery(){
        return "material/material_query";
    }

    @RequestMapping("materialmodify")
    public String materialModify(){
        return "material/material_modify";
    }

    @RequestMapping("usermanage")
    public String SystemUser(){
        return "system/user_manage";
    }

    @RequestMapping("departmentmanage")
    public String SystemDepartment(){
        return "system/department_manage";
    }

    @RequestMapping("materialsupplier")
    public String materialSupplier(){
        return "material/material_supplier";
    }

    @RequestMapping("customermanage")
    public String customerManage() { return "customer/customer_manage"; }

    @RequestMapping("repertoryrecords")
    public String repertoryRecords() { return "repertory/repertory_records"; }

    @RequestMapping("repertorycontrolrecords")
    public String repertoryControlRecords() { return "repertory/repertory_control_records"; }

    @RequestMapping("inrepertory")
    public String inPertory() { return "repertory/repertory_in"; };

    @RequestMapping("outrepertory")
    public String outPertory() { return "repertory/repertory_out"; };

    @RequestMapping("repertoryinfo")
    public String pertoryInfo() { return "repertory/repertory_info"; };

    @RequestMapping("/json")
    @ResponseBody
    public RestResult json(){
        return RestResult.CreateResult(1,userService.getAllUsernames());
    }


}
