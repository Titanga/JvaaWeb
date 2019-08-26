package com.obcy.service;

import com.obcy.bean.Users;

import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 11:42
 */
public interface IUserservice {
    Users FindUser(Users user);
    List<Users> findAllUser();
}
