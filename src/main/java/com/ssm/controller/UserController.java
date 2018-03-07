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
    /*
    * 进入首页
    * */

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "user/register";
    }

    @RequestMapping(value = "toLogin",method = RequestMethod.GET)
    public String ToLogin(){

        return "user/login";
    }

    /*
     * 注册
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String Register(User user){
        user.setRole("root");
        user.setStatus(1);
        user.setRegIp("127.0.0.8");
        //user.setUsername("刘恒根");
        System.out.println(user);
        int a = userServices.save(user);
        return "user/login";
    }

    /*
    * 登录
    * */

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Login(@RequestParam("username")String username,
                        @RequestParam("password") String password){
        // 先判断用户存不存在、判断密码是否正确
        //通过名字查找用户；
        User user = userServices.findByName(username);
        if (user == null){
            //用户名不存在跳转到登录页
            return "user/login";
        }else {
            if (user.getPassword().equals(password)) {
              return "user/index";
            }
        }
        return "user/login";
    }


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
