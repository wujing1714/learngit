package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.just.dao.InsertCargoDAO;
import edu.just.dao.ProcessResultDAO;
import edu.just.model.Cargo;
import edu.just.model.Mixed;
import edu.just.utils.DBUtils;

public class ProcessResultDAOImpl implements ProcessResultDAO {

	@Override
	public String processResult(String username, String projectname,
			String flag) {
		Connection conn = DBUtils.getConnection();
		String sql="";
		System.out.print(flag);
		if(flag.equals("true")){
			System.out.print(flag);
			 sql = "update dynamic set status='审核通过' where userName=? and projectName=?;";	
			
		}
		else if(flag.equals("false")){
			 sql = "update dynamic set status='审核未通过' where userName=? and projectName=?;";	
		}
		System.out.print("22222222"+username);
		System.out.print("33333333"+projectname);
	 
		PreparedStatement ps = null;
			//ResultSet rs = null;
			 
			ps = DBUtils.getPStmt(conn, sql);
			try {	
				ps.setString(1, username);
				ps.setString(2, projectname);
		 
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
