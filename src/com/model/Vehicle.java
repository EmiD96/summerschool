package com.model;

import java.time.LocalDate;

public abstract class Vehicle implements IVehicle {

	private String vehicleID; // license plate number
	private String brand; // car brand
	private int perRent; // daily rent
	private int deposit; // car deposit
	private LocalDate beginDayRent; // start date
	private int daysOfRent; // number of days for car rental

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPerRent() {
		return perRent;
	}

	public void setPerRent(int perRent) {
		this.perRent = perRent;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public LocalDate getBeginDayRent() {
		return beginDayRent;
	}

	public void setBeginDayRent(LocalDate beginDayRent) {
		this.beginDayRent = beginDayRent;
	}

	public int getDaysOfRent() {
		return daysOfRent;
	}

	public void setDaysOfRent(int daysOfRent) {
		this.daysOfRent = daysOfRent;
	}

	public Vehicle(String vehicleID, String brand, int perRent, int deposit, LocalDate beginDayRent, int daysOfRent) {
		super();
		this.vehicleID = vehicleID;
		this.brand = brand;
		this.perRent = perRent;
		this.deposit = deposit;
		this.beginDayRent = beginDayRent;
		this.daysOfRent = daysOfRent;
	}

	public Vehicle() {
		super();
	}

	@Override
	public double calcRent() {
		double discount = 1.0;
		double totalPrice = 0;
		if (daysOfRent > 150) {
			discount = 0.7;
		} else if (daysOfRent > 30) {
			discount = 0.8;
		} else if (daysOfRent > 7) {
			discount = 0.9;
		}
		totalPrice = perRent * daysOfRent * discount;
		return totalPrice;
	}

	

}
