package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.ConfirmCreateService;
import edu.just.service.InsertCargoService;
import edu.just.service.imp.ConfirmCreateServiceImpl;
import edu.just.service.imp.InsertCargoServiceImpl;

public class ConfirmCreateAction extends ActionSupport {
	
	private String userName;
	private String projectName;
	private String callback;
	private String createOK;
	
	public String confirmCreate(){
		System.out.println("connect success");
		System.out.println("1"+userName);
		 
		try {
			userName=URLDecoder.decode(userName,"UTF-8");
			projectName=URLDecoder.decode(projectName, "UTF-8");
	 
		 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("333"+userName);
		ConfirmCreateService create = new ConfirmCreateServiceImpl();	 
		createOK=create.confirmCreate(userName,projectName);
		
		return SUCCESS;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public String getCreateOK() {
		return createOK;
	}
	public void setCreateOK(String createOK) {
		this.createOK = createOK;
	}
	
	

}
