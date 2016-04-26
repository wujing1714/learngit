package edu.just.service.imp;

import edu.just.dao.DeleteCargoDAO;
import edu.just.dao.InsertCargoDAO;
import edu.just.dao.impl.DeleteCargoDAOImpl;
import edu.just.dao.impl.InsertCargoDAOImpl;
import edu.just.service.DeleteCargoService;

public class DeleteCargoServiceImpl implements DeleteCargoService {
	private DeleteCargoDAO deletecargodao = new DeleteCargoDAOImpl(); 
	@Override
	public String deleteCargo(String username, String projectname,
			String cargoname) {
		 
		return deletecargodao.deleteCargo(username,projectname,cargoname);
	}

}
