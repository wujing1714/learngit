package edu.just.service;

import edu.just.dao.CargoDAO;
import edu.just.dao.impl.CargoDAOImpl;

public class CargoService {
	private CargoDAO cargoDAO= new CargoDAOImpl();

	public CargoDAO getCargoDAO() {
		return cargoDAO;
	}

	public void setCargoDAO(CargoDAO cargoDAO) {
		this.cargoDAO = cargoDAO;
	}
	
	
}
