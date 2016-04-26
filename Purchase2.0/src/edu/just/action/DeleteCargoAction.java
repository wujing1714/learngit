package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.DeleteCargoService;
import edu.just.service.InsertCargoService;
 
import edu.just.service.imp.DeleteCargoServiceImpl;
import edu.just.service.imp.InsertCargoServiceImpl;

public class DeleteCargoAction extends ActionSupport{
	private String userName;
	private String projectName;
	private String cargoName;
	private String callback;
	private String deleteOK;
	
	public String deleteCargo(){
	
		System.out.println("connect success");
		System.out.println("1"+userName);
		System.out.println("1"+projectName);
		System.out.println("1"+cargoName);
		 
		try {
			userName=URLDecoder.decode(userName,"UTF-8");
			projectName=URLDecoder.decode(projectName, "UTF-8");
			cargoName=URLDecoder.decode(cargoName, "UTF-8"); 
			System.out.println("22"+cargoName);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("333"+userName);
		DeleteCargoService delete = new DeleteCargoServiceImpl();	 
		deleteOK=delete.deleteCargo(userName,projectName,cargoName); 
		
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

	public String getCargoName() {
		return cargoName;
	}

	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
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
