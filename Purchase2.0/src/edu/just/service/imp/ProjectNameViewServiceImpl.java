package edu.just.service.imp;

import java.util.ArrayList;

import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.UserDAO;
import edu.just.dao.impl.ProjectNameViewDAOImpl;
import edu.just.dao.impl.UserDAOImpl;
import edu.just.model.Mixed;
import edu.just.service.ProjectNameViewService;

public class ProjectNameViewServiceImpl implements ProjectNameViewService{
	private ProjectNameViewDAO projectnamedao = new ProjectNameViewDAOImpl(); 
	@Override
	public ArrayList<String> projectNameView(String userName){
				 
		ArrayList<String>  rs= new ArrayList<String>(projectnamedao.selectProjectName(userName));
		 return rs;
	 
	}
}

