package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.InsertCargoService;
import edu.just.service.ProcessResultService;
import edu.just.service.SubmmitService;
import edu.just.service.UserService;
import edu.just.service.imp.InsertCargoServiceImpl;
import edu.just.service.imp.ProcessResultServiceImpl;
import edu.just.service.imp.SubmmitServiceImpl;
import edu.just.service.imp.UserServiceImpl;

public class SubmmitAction extends ActionSupport  {
private String userName;
private String projectName;
private String message;
private String submmitOK;
private String callback;
 


public String submmit(){
	System.out.println("connect sccess");
	System.out.println("1"+userName);
	 
	try {
		userName=URLDecoder.decode(userName,"UTF-8");
		projectName=URLDecoder.decode(projectName, "UTF-8");
		message=URLDecoder.decode(message, "UTF-8");
	  
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.println("333"+userName);
	System.out.println("333"+message);
	SubmmitService submmit = new SubmmitServiceImpl();	 
	submmitOK=submmit.submmit(userName,projectName,message); 
	return SUCCESS;
}

 
public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


public String getSubmmitOK() {
	return submmitOK;
}


public void setSubmmitOK(String submmitOK) {
	this.submmitOK = submmitOK;
}


public String getCallback() {
	return callback;
}


public void setCallback(String callback) {
	this.callback = callback;
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
 
}
