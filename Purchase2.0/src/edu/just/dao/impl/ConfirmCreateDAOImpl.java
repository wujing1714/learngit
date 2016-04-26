package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.just.dao.ConfirmCreateDAO;
import edu.just.utils.DBUtils;

public class ConfirmCreateDAOImpl implements ConfirmCreateDAO {

	@Override
	public String confirmCreate(String username, String projectname) {
		Connection conn = DBUtils.getConnection();
		String sql = "insert into dynamic values(?,'´ýÉóºË',?,null);";		 
		PreparedStatement ps = null;
		//ResultSet rs = null;
		 
		ps = DBUtils.getPStmt(conn, sql);
		try {	
			 
			ps.setString(1, projectname);
			ps.setString(2, username);
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
