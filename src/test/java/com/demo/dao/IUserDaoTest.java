package com.demo.dao;

import com.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LiWeilong on 2017/7/3.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }
    @Test
    public void testinsertUser() throws Exception{

        User user = new User();
        user.setUsername("lwl");
        user.setPassword("123456");
        user.setEmail("744251229@qq.com");
        user.setRole("user");
        user.setRegTime(new Date());
        user.setRegIp("127.0.0.1");
        dao.insertUser(user);
    }


}
