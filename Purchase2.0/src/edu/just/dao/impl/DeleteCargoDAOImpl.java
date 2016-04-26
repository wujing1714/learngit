package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.just.dao.DeleteCargoDAO;
import edu.just.utils.DBUtils;

public class DeleteCargoDAOImpl implements DeleteCargoDAO {

	@Override
	public String deleteCargo(String username, String projectname,
			String cargoname) {
		Connection conn = DBUtils.getConnection();
		String sql = "delete from cargo where user=? and projectName=? and cargoName=?;";		 
		PreparedStatement ps = null;
		//ResultSet rs = null;
		 
		ps = DBUtils.getPStmt(conn, sql);
		try {		
			ps.setString(1, username);
			ps.setString(2, projectname);
			ps.setString(3, cargoname);			 
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
