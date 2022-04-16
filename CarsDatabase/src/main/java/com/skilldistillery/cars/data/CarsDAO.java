package com.skilldistillery.cars.data;

import com.skilldistillery.cars.entities.Cars;

public interface CarsDAO {
	
	public Cars findById(int id);
}
