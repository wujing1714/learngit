package edu.just.service.imp;

 
import edu.just.dao.ProcessResultDAO;
import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.SubmmitDAO;
import edu.just.dao.impl.InsertCargoDAOImpl;
import edu.just.dao.impl.ProcessResultDAOImpl;
import edu.just.dao.impl.ProjectNameViewDAOImpl;
import edu.just.dao.impl.SubmmitDAOImpl;
import edu.just.service.InsertCargoService;
import edu.just.service.ProcessResultService;
import edu.just.service.SubmmitService;

public class SubmmitServiceImpl implements SubmmitService {
	private SubmmitDAO submmitdao = new SubmmitDAOImpl(); 
	@Override
	public String submmit(String username, String projectname,String message) {
	 return submmitdao.submmit(username,projectname,message);
	}

}
