package com.ssm.service;

import com.ssm.model.User;

import java.util.List;

public interface UserService extends BaseService<User,Integer> {
    List<User> findAll();
}
