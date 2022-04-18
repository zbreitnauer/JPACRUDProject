package com.skilldistillery.cars.data;

import java.util.List;

import com.skilldistillery.cars.entities.Cars;

public interface CarsDAO {
	
	public Cars findById(int id);

	public List<Cars>findAll();
		
	public Cars addCar(Cars cars);
	
	public boolean deleteCars(int id);
	
	public Cars updateCars(int id, Cars cars);
	
//	public List<Cars> findByName(Cars model);
}