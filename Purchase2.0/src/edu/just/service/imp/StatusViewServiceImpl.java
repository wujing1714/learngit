package edu.just.service.imp;

import java.util.ArrayList;

import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.StatusViewDAO;
import edu.just.dao.impl.ProjectNameViewDAOImpl;
import edu.just.dao.impl.StatusViewDAOImpl;
import edu.just.model.Status;
import edu.just.service.StatusViewService;

public class StatusViewServiceImpl implements StatusViewService{
	
	private StatusViewDAO statusviewdao=new StatusViewDAOImpl();
	@Override
	public Status statusView(String userName,String projectName){
		 
		 return statusviewdao.selectStatus(userName,projectName);
	 
	}

}
