package edu.just.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private static Connection conn;
	private static String user = "root";
	private static String passWard = "100677";
	private static String url = "jdbc:mysql://localhost:3306/phrase";
	// private static String url =
	// "jdbc:mysql://mysql56.rdsmccr0sbvb0am.rds.bj.baidubce.com:3306/cloud2";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Connection err");
			e.printStackTrace();
		}
	}

	/**
	 * 封装mysql连接
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, passWard);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static PreparedStatement getPStmt(Connection conn, String sql) {
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prepareStatement;
	}

	/**
	 * 释放jdbc连接
	 * 
	 * @param conn
	 * @param ps
	 * @param result
	 */
	public static void releaseConn(Connection conn, PreparedStatement ps) {

		if (ps != null) {
			try {
				ps.close();
				ps = null;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static void releaseConn(Connection conn, Statement statement,
			ResultSet result) {
		if (result != null) {
			try {
				result.close();
				result = null;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
				statement = null;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
