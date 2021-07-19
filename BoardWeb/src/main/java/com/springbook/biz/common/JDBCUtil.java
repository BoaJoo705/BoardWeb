package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/studydb?serverTimezone=UTC","study","1111");
//			Class.forName("org.h2.Driver");
//			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if(stmt !=null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}finally {
				stmt=null;
			}
		}	
	}
	public static void close(ResultSet rs,PreparedStatement stmt, Connection conn) {
		if(rs!= null) {
			try {
				if(!rs.isClosed()) rs.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		if(stmt!=null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				stmt=null;
			}
		}
	}
}
