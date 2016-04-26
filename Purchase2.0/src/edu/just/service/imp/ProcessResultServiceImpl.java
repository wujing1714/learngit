package edu.just.service.imp;

 
import edu.just.dao.ProcessResultDAO;
import edu.just.dao.ProjectNameViewDAO;
import edu.just.dao.impl.InsertCargoDAOImpl;
import edu.just.dao.impl.ProcessResultDAOImpl;
import edu.just.dao.impl.ProjectNameViewDAOImpl;
import edu.just.service.InsertCargoService;
import edu.just.service.ProcessResultService;

public class ProcessResultServiceImpl implements ProcessResultService {
	private ProcessResultDAO processresultdao = new ProcessResultDAOImpl(); 
	@Override
	public String processResult(String username, String projectname,String flag) {
	 return processresultdao.processResult(username,projectname,flag);
	}

}
