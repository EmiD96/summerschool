package com.model;

import java.time.LocalDate;

public class Car extends Vehicle {

	private String engineType; // termic, hybrid, electric...

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String vehicleID, String brand, int perRent, int deposit, LocalDate beginDayRent, int daysOfRent,
			String engineType) {
		super(vehicleID, brand, perRent, deposit, beginDayRent, daysOfRent);
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public boolean rentValidation() {
		if (getDeposit() >= 50000 && getDaysOfRent() >= 1) {
			return true;
		} else {
			System.out.println("The number of rental days is not valid or the deposit is not valid!");
			return false;
		}
	}

}
