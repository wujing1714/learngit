package edu.just.service.imp;

import edu.just.dao.DeleteCargoDAO;
import edu.just.dao.DeleteProjectDAO;
import edu.just.dao.impl.DeleteCargoDAOImpl;
import edu.just.dao.impl.DeleteProjectDAOImpl;
import edu.just.service.DeleteProjectService;

public class DeleteProjectServiceImpl implements DeleteProjectService {
	private DeleteProjectDAO deleteprojectdao = new DeleteProjectDAOImpl(); 
	@Override
	public String deleteProject(String username, String projectname) {
		 
		return deleteprojectdao.deleteProject(username,projectname);
	}

}
