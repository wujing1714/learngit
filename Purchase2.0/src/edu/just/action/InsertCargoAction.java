package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.ActionSupport;

import edu.just.service.InsertCargoService;
import edu.just.service.UserService;
import edu.just.service.imp.InsertCargoServiceImpl;
import edu.just.service.imp.UserServiceImpl;

public class InsertCargoAction extends ActionSupport  {
private String userName;
private String projectName;
private String cargoName;
private int unitPrice;
private int number;
private String callback;
private String insertOK;


public String insertCargo(){
	System.out.println("connect success");
	System.out.println("1"+userName);
	 
	try {
		userName=URLDecoder.decode(userName,"UTF-8");
		projectName=URLDecoder.decode(projectName, "UTF-8");
		cargoName=URLDecoder.decode(cargoName, "UTF-8");
	 
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.println("333"+userName);
	InsertCargoService insert = new InsertCargoServiceImpl();	 
	insertOK=insert.insertCargo(userName,projectName,cargoName,unitPrice,number); 
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
public int getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(int unitPrice) {
	this.unitPrice = unitPrice;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getCallback() {
	return callback;
}
public void setCallback(String callback) {
	this.callback = callback;
}
public String getInsertOK() {
	return insertOK;
}
public void setInsertOK(String insertOK) {
	this.insertOK = insertOK;
}
}
