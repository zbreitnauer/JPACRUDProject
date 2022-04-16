package com.skilldistillery.cars.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String make;
	private String model;

	public Cars() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", make=" + make + ", model=" + model + "]";
	}

}
