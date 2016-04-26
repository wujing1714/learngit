package edu.just.service.imp;

import edu.just.dao.ConfirmCreateDAO;
import edu.just.dao.impl.ConfirmCreateDAOImpl;
import edu.just.service.ConfirmCreateService;

public class ConfirmCreateServiceImpl implements ConfirmCreateService {
private ConfirmCreateDAO confirmcreate=new ConfirmCreateDAOImpl();
	@Override
	public String confirmCreate(String username, String projectname) {
		// TODO Auto-generated method stub
		return confirmcreate.confirmCreate(username,projectname);
	}

}
