package edu.just.model;

public class Cargo {
	private String cargoName;
	private int unitPrice;
	private int number;
	private String projectName;
	private String id;
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
	
	public String getProjectName() {
		return projectName;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "cargo [cargoName=" + cargoName + ", unitPrice=" + unitPrice
				+ ", number=" + number + ", projectName=" + projectName
				+ ", id=" + id + "]";
	}
	 

}
