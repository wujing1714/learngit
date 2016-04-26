package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.just.dao.AllProjectNameViewDAO;
import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.UserDAO;
import edu.just.model.Mixed;
import edu.just.model.ProjectNPU;
import edu.just.utils.DBUtils;

public class AllProjectNameViewDAOImpl implements AllProjectNameViewDAO{
 
	@Override
	public ArrayList<ProjectNPU> selectAllProjectName(){
		Connection conn = DBUtils.getConnection();
		String sql = "select userName,projectName from dynamic;";		 
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<ProjectNPU> arr = new ArrayList<ProjectNPU>();
		ps = DBUtils.getPStmt(conn, sql);
		try {			 
			rs = ps.executeQuery();
			while (rs.next()) {
				ProjectNPU pn=new ProjectNPU();
				pn.setUserName(rs.getString("userName"));
				pn.setProjectName(rs.getString("projectName"));
				System.out.println("pppp"); 
				 arr.add(pn);			 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.releaseConn(conn, ps, rs);
		}
		return arr;
	}
}
