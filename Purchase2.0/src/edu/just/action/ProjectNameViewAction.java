package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.ProjectNameViewService;
import edu.just.service.UserService;
import edu.just.service.imp.ProjectNameViewServiceImpl;
import edu.just.service.imp.UserServiceImpl;

public class ProjectNameViewAction extends ActionSupport{
	private String userName;
	private String callback;
	
	private ArrayList<String> list=new ArrayList<String>();
	
	public String projectNameView(){
		System.out.println("connect success");
		System.out.println("1"+userName);
		try {
			userName=URLDecoder.decode(userName,"UTF-8");
		 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("22"+userName);
		ProjectNameViewService projectnameview = new ProjectNameViewServiceImpl();
		 
		list = new ArrayList<String>(projectnameview.projectNameView(userName));	 	 
		return SUCCESS;
	}
 
	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = new ArrayList<String>(list);
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 

}
