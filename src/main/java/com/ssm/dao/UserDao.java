package com.ssm.dao;


import com.ssm.model.User;

import java.util.List;

public interface UserDao extends BaseDao<User ,Integer> {
    List<User> findAll();
}
