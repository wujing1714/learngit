package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.just.dao.UserDAO;
import edu.just.model.Mixed;
import edu.just.utils.DBUtils;
import  edu.just.action.LoginAction;

public class UserDAOImpl implements UserDAO{

	@Override
	public Mixed selectUser(String userName){
		Connection conn = DBUtils.getConnection();
		String sql = "select password,authority from users where user=?";		 
		PreparedStatement ps = null;
		ResultSet rs = null;
		Mixed mixed = new Mixed();
		ps = DBUtils.getPStmt(conn, sql);
		try {
			ps.setString(1, userName);
			rs = ps.executeQuery();
			while (rs.next()) {
				mixed.setOther(rs.getString("password"));
				mixed.setAuthority(rs.getString("authority")); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.releaseConn(conn, ps, rs);
		}
		return mixed;
	}

}
