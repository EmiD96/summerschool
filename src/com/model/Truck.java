package com.model;

import java.time.LocalDate;

public class Truck extends Vehicle {
	
	private String space; // small, medium, large
	
	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}


	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String vehicleID, String brand, int perRent, int deposit, LocalDate beginDayRent, int daysOfRent, String space) {
		super(vehicleID, brand, perRent, deposit, beginDayRent, daysOfRent);
		this.space = space;
	}

	@Override
	public boolean rentValidation() {
		if (getDeposit() >= 80000 && getDaysOfRent() >= 2) {
			return true;
		} else {
			System.out.println("The number of rental days is not valid!");
			return false;
		}
	}
	

}
