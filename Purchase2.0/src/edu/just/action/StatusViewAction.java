package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.HttpContext;

import edu.just.model.Cargo;
import edu.just.service.ProjectNameViewService;
import edu.just.service.StatusViewService;
import edu.just.service.imp.ProjectNameViewServiceImpl;
import edu.just.service.imp.StatusViewServiceImpl;
 

public class StatusViewAction extends ActionSupport{
	private String userName;
	private String projectName;
	private String callback;
	private String message;
	private String status;
	private ArrayList<Cargo> cargoList=new ArrayList<Cargo>();
	
	public String statusView(){
		System.out.println("connect success");
		System.out.println("1"+projectName);
		 
		try {
			userName=URLDecoder.decode(userName,"UTF-8");	
			projectName=URLDecoder.decode(projectName,"UTF-8");		 
		 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("22"+projectName);
	 
		 
		StatusViewService statusview = new StatusViewServiceImpl();
		System.out.println("333"+projectName); 
		cargoList = new ArrayList<Cargo>(statusview.statusView(userName,projectName).getArr());	 
		System.out.println("4444"+projectName);
		message =  statusview.statusView(userName,projectName).getMessage();	 
		System.out.println("55"+projectName);
		status =  statusview.statusView(userName,projectName).getStaus();	
		System.out.println("66"+projectName);
		
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Cargo> getCargoList() {
		return cargoList;
	}

	public void setCargoList(ArrayList<Cargo> cargoList) {
		this.cargoList = cargoList;
	}
 
 
	 

}
