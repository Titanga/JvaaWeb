package com.obcy.Test;

import com.obcy.bean.Users;
import com.obcy.dao.impl.UserDao;

import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 11:09
 */
public class Test {


    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        List<Users> allUser = userDao.findAllUser();
        System.out.println("allUser = " + allUser);
    }

}
