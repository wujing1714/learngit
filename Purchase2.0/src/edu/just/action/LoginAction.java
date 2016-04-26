package edu.just.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import com.opensymphony.xwork2.ActionSupport;
import edu.just.service.UserService;
import edu.just.service.imp.UserServiceImpl;
import edu.just.model.Mixed;

public class LoginAction extends ActionSupport {
	
	/**
	 * login parameter
	 */
	private String userName;
	private String passWord;
	private String authority;
	private String loginOK;
	private String callback;

	
	public String loginUser(){
		System.out.println("connect success");
		System.out.println("1"+userName);
		System.out.println("22"+passWord);
		try {
			userName=URLDecoder.decode(userName,"UTF-8");
			passWord=URLDecoder.decode(passWord, "UTF-8");
		 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("333"+userName);
		UserService us = new UserServiceImpl();
		 
		loginOK = us.loginUser(userName, passWord).getOther();
		System.out.println(loginOK);
		authority=us.loginUser(userName, passWord).getAuthority();
		 
		return SUCCESS;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getLoginOK() {
		return loginOK;
	}
	public void setLoginOK(String loginOK) {
		this.loginOK = loginOK;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	
}

