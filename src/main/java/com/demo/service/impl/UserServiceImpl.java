package com.demo.service.impl;

import com.demo.dao.IUserDao;
import com.demo.model.User;
import com.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LiWeilong on 2017/7/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
