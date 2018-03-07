package com.ssm.service;

import com.ssm.model.User;
import com.ssm.utils.ValidateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;
     @Test
    public void get(){
         String s = "刘恒根";
         boolean flag = ValidateUtils.isChinese(s);
         System.out.println(flag);

         User user = userService.get(1);
         System.err.println(user);
    }
}
