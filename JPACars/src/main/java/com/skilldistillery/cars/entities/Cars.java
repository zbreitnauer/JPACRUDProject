package com.skilldistillery.cars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int year;
	private String make;
	private String model;
	private String engine;
	private String transmission;
	private String drivetrain;
	@Column(name = "force_induction")
	private String forceInduction;
	private Integer mpg;
	private String photo;

	public Cars() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getDrivetrain() {
		return drivetrain;
	}

	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}

	public String getForceInduction() {
		return forceInduction;
	}

	public void setForceInduction(String forceInduction) {
		this.forceInduction = forceInduction;
	}

	public Integer getMpg() {
		return mpg;
	}

	public void setMpg(Integer mpg) {
		this.mpg = mpg;
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Id: " + id +"\n" + "Year: " + year +"\n" + "Make: " + make +"\n" + "Model: " + model +"\n" + "Engine: " + engine
				+"\n" + "Transmission: " + transmission +"\n" + "Drivetrain: " + drivetrain +"\n" + "Force Induction: " + forceInduction
				+"\n" + "Mpg: " + mpg +"\n" + "Photo: " + photo;
	}
}
