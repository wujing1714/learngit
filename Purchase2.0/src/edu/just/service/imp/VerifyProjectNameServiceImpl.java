package edu.just.service.imp;

import edu.just.dao.ConfirmCreateDAO;
import edu.just.dao.VerifyProjectNameDAO;
import edu.just.dao.impl.ConfirmCreateDAOImpl;
import edu.just.dao.impl.VerifyProjectNameDAOImpl;
import edu.just.service.VerifyProjectNameService;

public class VerifyProjectNameServiceImpl implements VerifyProjectNameService {
	private VerifyProjectNameDAO verifyprojectname=new VerifyProjectNameDAOImpl();
	@Override
	public String verifyProjectName(String username, String projectname) {
		// TODO Auto-generated method stub
		return  verifyprojectname.verifyProjectName(username,projectname);
	}

}
