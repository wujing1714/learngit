package edu.just.model;

import java.util.ArrayList;

public class Status {
	 private ArrayList<Cargo> arr=new ArrayList<Cargo>();
	 private String staus;
	 private String message;
	 public void inserToArrayList(Cargo cargo){
		 this.arr.add(cargo);
	 }
	 
	public ArrayList<Cargo> getArr() {
		return arr;
	}
	public void setArr(ArrayList<Cargo> arr) {
		this.arr = new ArrayList<Cargo>(arr);
	}
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 
	 

}
