package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.just.dao.InsertCargoDAO;
import edu.just.model.Cargo;
import edu.just.model.Mixed;
import edu.just.utils.DBUtils;

public class InsertCargoDAOImpl implements InsertCargoDAO {

	@Override
	public String insertCargo(String username, String projectname,
			String cargoname, int unitprice, int number) {
		int flag=0;
		Connection conn2 = DBUtils.getConnection();
		String sql2 = "select * from cargo where user=? and cargoName=? and projectName=?;";
		PreparedStatement ps2 = null;
		ResultSet rs2 = null;
		ps2 = DBUtils.getPStmt(conn2, sql2);
		try {
			ps2.setString(1, username);	 
			ps2.setString(2, cargoname);	
			ps2.setString(3, projectname);	
			rs2 = ps2.executeQuery();
			 
			while (rs2.next()) {
				flag=1;;
			}
		} catch (SQLException e) {
			return "false";
		}finally{
			DBUtils.releaseConn(conn2, ps2, rs2);
		}
		 
		if(flag==1){
			
			Connection conn1 = DBUtils.getConnection();
			String sql1 = "update cargo set unitprice=?,number=? where user=? and cargoName=? and projectName=?;";		 
			PreparedStatement ps1 = null;
			//ResultSet rs = null;
			 
			ps1 = DBUtils.getPStmt(conn1, sql1);
			try {	
				ps1.setString(4, cargoname);
				ps1.setInt(1, unitprice);
				ps1.setInt(2, number);
				ps1.setString(5, projectname);
				ps1.setString(3, username);
				ps1.execute();
			/*	while (rs.next()) {
					mixed.setOther(rs.getString("password"));
					mixed.setAuthority(rs.getString("authority")); 
				}*/
			} catch (SQLException e) {
				 return "false";
			}finally{
				DBUtils.releaseConn(conn1, ps1);
			}
			return "true";
		}
		
		else{
			Connection conn = DBUtils.getConnection();
			String sql = "insert into cargo values(?,?,?,?,?);";		 
			PreparedStatement ps = null;
			//ResultSet rs = null;
			 
			ps = DBUtils.getPStmt(conn, sql);
			try {	
				ps.setString(1, cargoname);
				ps.setInt(2, unitprice);
				ps.setInt(3, number);
				ps.setString(4, projectname);
				ps.setString(5, username);
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

}
