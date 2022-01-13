package com.model;

import java.time.LocalDate;

public class Bus extends Vehicle{
	
	private int noOfSeats;
	
	

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bus(String vehicleID, String brand, int perRent, int deposit, LocalDate beginDayRent, int daysOfRent, int noOfSeats) {
		super(vehicleID, brand, perRent, deposit, beginDayRent, daysOfRent);
		this.noOfSeats = noOfSeats;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	@Override
	public boolean rentValidation() {
		if (getDeposit() >= 100000 && getDaysOfRent() >= 3) {
			return true;
		} else {
			System.out.println("The number of rental days is not valid!");
			return false;
		}
	}
	
	

}
