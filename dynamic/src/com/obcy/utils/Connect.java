package com.obcy.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @auther obcy
 * @date 2019/8/24 0024 - 11:25
 */
public class Connect {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/user?serverTimezone=GMT%2B8";
        Connection conn=null;
        try {
            conn = DriverManager.getConnection(url,"root","1112");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);

    }
}
