package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.InsertCargoService;
import edu.just.service.ProcessResultService;
import edu.just.service.UserService;
import edu.just.service.imp.InsertCargoServiceImpl;
import edu.just.service.imp.ProcessResultServiceImpl;
import edu.just.service.imp.UserServiceImpl;

public class ProcessResultAction extends ActionSupport  {
private String userName;
private String projectName;
private String flag;
private String resultOK;
 


public String processResult(){
	System.out.println("connect sccess");
	System.out.println("1"+userName);
	 
	try {
		userName=URLDecoder.decode(userName,"UTF-8");
		projectName=URLDecoder.decode(projectName, "UTF-8");
	  
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.println("333"+userName);
	ProcessResultService result = new ProcessResultServiceImpl();	 
	resultOK=result.processResult(userName,projectName,flag); 
	return SUCCESS;
}

public String getFlag() {
	return flag;
}

public void setFlag(String flag) {
	this.flag = flag;
}

public String getResultOK() {
	return resultOK;
}

public void setResultOK(String resultOK) {
	this.resultOK = resultOK;
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
