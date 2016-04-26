package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.just.dao.VerifyProjectNameDAO;
import edu.just.utils.DBUtils;

public class VerifyProjectNameDAOImpl implements VerifyProjectNameDAO {

	@Override
	public String verifyProjectName(String username, String projectname) {
		Connection conn = DBUtils.getConnection();
		 System.out.println("111jkjkjk");
		String sql = "select * from dynamic where userName=? and projectName=?;";		 
		PreparedStatement ps = null;
		ResultSet rs = null;
		 System.out.println("jkjkjk");
		ps = DBUtils.getPStmt(conn, sql);
		try {	
			ps.setString(1, username);
			ps.setString(2, projectname);		
			rs=ps.executeQuery();
		 	while (rs.next()) {				 
			 return "false";	
		 	}
		} catch (SQLException e) {
			 return "false";
		}finally{
			DBUtils.releaseConn(conn, ps,rs);
		}
		return "true";
	}

}
