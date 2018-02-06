package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import com.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
*  SSM框架样办
* 1、使用泛型
* 2、基本在SSM框架
* 3、实现单元测试
* */

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userServices;

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(@RequestParam("id") Integer id){
        User user = userServices.get(id);
        return  user.toString();
    }


    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    private @ResponseBody Result getAll(){
        return Result.createSuccessResult().setData(userServices.findAll()).setMessage("success");
    }



}
