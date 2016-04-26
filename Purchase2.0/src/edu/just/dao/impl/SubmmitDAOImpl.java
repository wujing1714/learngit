package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.just.dao.InsertCargoDAO;
import edu.just.dao.ProcessResultDAO;
import edu.just.dao.SubmmitDAO;
import edu.just.model.Cargo;
import edu.just.model.Mixed;
import edu.just.utils.DBUtils;

public class SubmmitDAOImpl implements SubmmitDAO {

	@Override
	public String submmit(String username, String projectname,
			String message) {
		Connection conn = DBUtils.getConnection();
	 
		String	sql ="update dynamic set message=? where userName=? and projectName=?;";	
			
	 
	 
		System.out.print("22222222"+username);
		System.out.print("33333333"+projectname);
		System.out.print("33333333"+message);
	 
		PreparedStatement ps = null;
			//ResultSet rs = null;
			 
			ps = DBUtils.getPStmt(conn, sql);
			try {	
				ps.setString(1, message);
				ps.setString(2, username);
				ps.setString(3, projectname);
						 
				ps.execute();
			/*	while (rs.next()) {
					mixed.setOther(rs.getString("password"));
					mixed.setAuthority(rs.getString("authority")); 
				}*/
			} catch (SQLException e) {
				 return "false";
			}finally{
				DBUtils.releaseConn(conn, ps);
			}
			return "true";
			
	 
		
	}

}
