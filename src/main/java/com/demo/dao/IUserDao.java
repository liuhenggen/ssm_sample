package com.demo.dao;

import com.demo.model.User;

/**
 * Created by LiWeilong on 2017/7/3.
 */
public interface IUserDao {

    User selectUser(long id);

    int insertUser(User user);


}
