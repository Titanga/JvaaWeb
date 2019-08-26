package com.obcy.service.userserviceimpl;

import com.obcy.bean.Users;
import com.obcy.dao.impl.UserDao;
import com.obcy.service.IUserservice;

import java.util.List;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 12:10
 */
public class UserServiceimpl implements IUserservice {
    @Override
    public Users FindUser(Users user) {
        return new UserDao().findUser(user);
    }

    @Override
    public List<Users> findAllUser() {
        return new UserDao().findAllUser();
    }
}
