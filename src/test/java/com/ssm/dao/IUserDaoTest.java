package com.ssm.dao;

import com.ssm.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by LiWeilong on 2017/7/3.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private  UserDao dao;
    @Test
    public void testSelectUser() throws Exception {
        Integer id = 1;
        User user = dao.get(id);
        List<User> list  =  dao.findAll();
        for (User user1 : list) {
            System.out.println(user1);
        }
        //System.out.println(user.getUsername());
    }



}
