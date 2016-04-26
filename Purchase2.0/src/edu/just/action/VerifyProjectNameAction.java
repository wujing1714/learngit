package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.ConfirmCreateService;
import edu.just.service.VerifyProjectNameService;
import edu.just.service.imp.ConfirmCreateServiceImpl;
import edu.just.service.imp.VerifyProjectNameServiceImpl;

public class VerifyProjectNameAction extends ActionSupport{
	private String userName;
	private String projectName;
	private String callback;
	private String verifyOK;
	
	
	public String verifyProjectName(){
		System.out.println("connect success");
		System.out.println("1"+userName);
		 
		try {
			userName=URLDecoder.decode(userName,"UTF-8");
			projectName=URLDecoder.decode(projectName, "UTF-8");
			System.out.println("1"+userName);
		 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("333"+userName);
		VerifyProjectNameService verify = new VerifyProjectNameServiceImpl();	 
		verifyOK=verify.verifyProjectName(userName,projectName);
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
	public String getVerifyOK() {
		return verifyOK;
	}
	public void setVerifyOK(String verifyOK) {
		this.verifyOK = verifyOK;
	}
	

}
