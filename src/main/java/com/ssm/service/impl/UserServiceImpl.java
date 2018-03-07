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
    public Integer save(User user) {
        return userDaos.save(user);
    }

    @Override
    public Integer update(User user) {
        return null;
    }

    @Override
    public Integer delete(Integer integer) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userDaos.findAll();
    }

    @Override
    public User findByName(String username) {
        return userDaos.findByName(username);
    }
}
