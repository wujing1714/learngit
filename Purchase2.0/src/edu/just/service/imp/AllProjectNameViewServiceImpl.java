package edu.just.service.imp;

import java.util.ArrayList;

import edu.just.dao.AllProjectNameViewDAO;
import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.UserDAO;
import edu.just.dao.impl.AllProjectNameViewDAOImpl;
import edu.just.dao.impl.ProjectNameViewDAOImpl;
import edu.just.dao.impl.UserDAOImpl;
import edu.just.model.Mixed;
import edu.just.model.ProjectNPU;
import edu.just.service.AllProjectNameViewService;
import edu.just.service.ProjectNameViewService;

public class AllProjectNameViewServiceImpl implements AllProjectNameViewService{
	private AllProjectNameViewDAO allprojectnamedao = new AllProjectNameViewDAOImpl(); 
	@Override
	public ArrayList<ProjectNPU> allProjectNameView(){
				 
		ArrayList<ProjectNPU>  rs= new ArrayList<ProjectNPU>(allprojectnamedao.selectAllProjectName());
		 return rs;
	 
	}
}

