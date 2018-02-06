package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userServices")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDaos;
    @Override
    public User get(Integer integer) {
        return userDaos.get(integer);
    }

    @Override
    public List<User> findAll() {
        return userDaos.findAll();
    }
}
