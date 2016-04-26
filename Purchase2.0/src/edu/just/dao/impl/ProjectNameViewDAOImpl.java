package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.UserDAO;
import edu.just.model.Mixed;
import edu.just.utils.DBUtils;

public class ProjectNameViewDAOImpl implements ProjectNameViewDAO{
 
	@Override
	public ArrayList<String> selectProjectName(String userName){
		Connection conn = DBUtils.getConnection();
		String sql = "select projectName from dynamic where userName=?";		 
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<String> arr = new ArrayList<String>();
		ps = DBUtils.getPStmt(conn, sql);
		try {
			ps.setString(1, userName);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("pppp"); 
				 arr.add(rs.getString("projectName"));			 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.releaseConn(conn, ps, rs);
		}
		return arr;
	}
}
