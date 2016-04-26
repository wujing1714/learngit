package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.model.ProjectNPU;
import edu.just.service.AllProjectNameViewService;
import edu.just.service.ProjectNameViewService;
import edu.just.service.UserService;
import edu.just.service.imp.AllProjectNameViewServiceImpl;
import edu.just.service.imp.ProjectNameViewServiceImpl;
import edu.just.service.imp.UserServiceImpl;

public class AllProjectNameViewAction extends ActionSupport{
	 
	private String callback;
	
	private ArrayList<ProjectNPU> list=new ArrayList<ProjectNPU>();
	
	public String allProjectNameView(){
		System.out.println("connect success");
		  
		AllProjectNameViewService allprojectnameview = new AllProjectNameViewServiceImpl();
		 
		list = new ArrayList<ProjectNPU>(allprojectnameview.allProjectNameView());	 	 
		return SUCCESS;
	}
 
	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public ArrayList<ProjectNPU> getList() {
		return list;
	}

	public void setList(ArrayList<ProjectNPU> list) {
		this.list = new ArrayList<ProjectNPU>(list);
	}

 

}
