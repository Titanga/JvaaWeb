package com.obcy.dao;

import com.obcy.bean.Users;

import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 11:45
 */
public interface IUserDao {
    //根据用户查找
    Users findUser(Users u);
    List<Users> findAllUser();
}
