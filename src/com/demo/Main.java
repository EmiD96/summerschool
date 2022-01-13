package com.demo;

import java.util.Scanner;

import com.controller.ManageVehicle;
import com.model.Vehicle;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the car rental system!");
		System.out.println("Please enter the type of vehicle");
		System.out.println("1 car \t2 bus \t3 truck");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		String type = null;
		switch (choice) {
		case 1:
			type = "car";
			break;
		case 2:
			type = "bus";
			break;
		case 3:
			type = "truck";
			break;
		default: 
			type = "car";
			
		}
		Vehicle vehicle = ManageVehicle.getVehicle(type);
		if (ManageVehicle.rentValidation(vehicle)) {
			System.out.println("Please eneter the number of days");
			int days = input.nextInt();
			vehicle.setDaysOfRent(days);
			double costs = vehicle.calcRent();
			System.out.println("Rental granted! Total chargable: "+costs+" with a deposit of "+vehicle.getDeposit());
		}

	}

}
