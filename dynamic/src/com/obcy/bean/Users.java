package com.obcy.bean;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 10:55
 */
public class Users {
    /**
    *用户ID
    */
    private int uid ;
    /**
    *用户名
    */
    private String uname;
    /**
    *用户密码
    */
    private String password ;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getPassword() {
        return password;
    }

    public Users(Integer o, String root, String password) {
    }

    public Users(int uid, String uname, String password) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
