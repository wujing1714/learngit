package edu.just.service.imp;

import edu.just.dao.InsertCargoDAO;
import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.impl.InsertCargoDAOImpl;
import edu.just.dao.impl.ProjectNameViewDAOImpl;
import edu.just.service.InsertCargoService;

public class InsertCargoServiceImpl implements InsertCargoService {
	private InsertCargoDAO intercargodao = new InsertCargoDAOImpl(); 
	@Override
	public String insertCargo(String username, String projectname,
			String cargoname, int unitprice, int number) {
	 return intercargodao.insertCargo(username,projectname,cargoname,unitprice,number);
	}

}
