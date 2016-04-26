package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.DeleteProjectService;
import edu.just.service.InsertCargoService;
import edu.just.service.imp.DeleteProjectServiceImpl;
import edu.just.service.imp.InsertCargoServiceImpl;

public class DeleteProjectAction extends ActionSupport{
	private String userName;
	private String projectName;
	private String callback;
	private String deleteOK;
	
	public String deleteProject(){
		System.out.println("connect success");
		System.out.println("1"+userName);
		System.out.println("1"+projectName);
		 
		try { 
			userName=URLDecoder.decode(userName, "UTF-8");
			projectName=URLDecoder.decode(projectName, "UTF-8");
 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("333"+projectName);
		DeleteProjectService delete = new DeleteProjectServiceImpl();	 
		deleteOK=delete.deleteProject(userName,projectName); 
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
	public String getDeleteOK() {
		return deleteOK;
	}
	public void setDeleteOK(String deleteOK) {
		this.deleteOK = deleteOK;
	}
	
	
}
