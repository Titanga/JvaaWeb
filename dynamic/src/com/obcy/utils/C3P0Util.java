package com.obcy.utils;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Util {
	
	private static DataSource ds = null;
	
	static {
		ds = new ComboPooledDataSource();
	}
	
	public static DataSource getDataSource() {
		
		return ds;
	}
	public static Connection getConnection() {
		
		Connection conn = null;
		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
