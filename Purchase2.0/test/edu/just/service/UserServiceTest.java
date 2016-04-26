package edu.just.service;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import edu.just.model.User;
import edu.just.utils.DBUtils;

public class UserServiceTest {

	private Connection connection;
 	
	 
	@Test
	public void Connectiontest(){
		connection = DBUtils.getConnection();
}
}