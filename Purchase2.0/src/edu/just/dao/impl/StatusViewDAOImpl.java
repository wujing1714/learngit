package edu.just.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.just.dao.StatusViewDAO;
import edu.just.model.Cargo;
import edu.just.model.Status;
import edu.just.utils.DBUtils;

public class StatusViewDAOImpl implements StatusViewDAO {

	@Override
	public Status selectStatus(String userName,String projectName) {
		Status status=new Status();	
		Connection conn1 = DBUtils.getConnection();
		String sql1 = "select message,status from dynamic where userName=? and projectName=?";		 		
		System.out.println("aaaa"+projectName); 
		PreparedStatement ps1 = null;		
		ResultSet rs1 = null;
		ps1 = DBUtils.getPStmt(conn1, sql1);
		
		try {
			ps1.setString(1, userName);
			ps1.setString(2, projectName);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				status.setMessage(rs1.getString("message"));
				status.setStaus(rs1.getString("status"));	 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.releaseConn(conn1, ps1, rs1);
		}
		
		
		System.out.println("bbbb"+projectName);  
		Connection conn2 = DBUtils.getConnection();
		String sql2 = "select cargoName,unitPrice,number from cargo where user=? and projectName=?";
		PreparedStatement ps2 = null;
		ResultSet rs2 = null;
		ps2 = DBUtils.getPStmt(conn2, sql2);
		System.out.println("ccc"+projectName); 
		try {
			ps2.setString(1, userName);
			ps2.setString(2, projectName);
			System.out.println("iii"+projectName);
			rs2 = ps2.executeQuery();
			System.out.println("hhh"+projectName);
			while (rs2.next()) {
				Cargo cargo=new Cargo();
				cargo.setCargoName(rs2.getString("cargoName"));
				cargo.setNumber(rs2.getInt("number"));
				cargo.setUnitPrice(rs2.getInt("unitPrice"));	
				System.out.println("ee1e"+projectName); 
				status.inserToArrayList(cargo);
				System.out.println("kkk2k"+projectName); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.releaseConn(conn2, ps2, rs2);
		}
		System.out.println("ddd"+projectName); 
		return status;
	}

}
