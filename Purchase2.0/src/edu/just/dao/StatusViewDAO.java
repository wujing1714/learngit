package edu.just.dao;

import java.util.ArrayList;

import edu.just.model.Status;

public interface StatusViewDAO {
	public Status selectStatus(String userName,String projectName);
 
}
