package com.obcy.dao.impl;

import com.obcy.bean.Users;
import com.obcy.dao.IUserDao;
import com.obcy.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.net.SocketTimeoutException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 11:49
 */
public class UserDao implements IUserDao {

    @Override
    public Users findUser(Users u) {
        QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
        Users user = null;
        String sql ="select * from users where uname=? and password=?";
        try {
            user = qr.query(sql,new BeanHandler<Users>(Users.class),u.getUname(),u.getPassword());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<Users> findAllUser() {
        QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
        String sql = "select * from users";
        List<Users> usersList = new ArrayList<>();
        try {
            usersList = qr.query(sql,new BeanListHandler<Users>(Users.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersList;
    }
}
