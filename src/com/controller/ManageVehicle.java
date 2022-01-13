package com.controller;

import com.model.*;
import java.time.LocalDate;

public class ManageVehicle {
	
	public static Vehicle getVehicle (String type) {
		Vehicle vehicle = null;
		if ("car".equals(type)) {
			vehicle = new Car("BV 01 ABC", "Toyota", 400, 5000, LocalDate.now(), 2, "Hybrid");
		}
		else if ("bus".equals(type)) {
			vehicle = new Bus("BV 02 ABC", "Toyota", 1000, 100000, LocalDate.now(), 2, 20);
		}
		else if ("truck".equals(type)) {
			vehicle = new Truck("BV 03 ABC", "Toyota", 800, 80000, LocalDate.now(), 2, "medium");
		}
		return vehicle;
		
	}
	
	public static boolean rentValidation (IVehicle iv) {
		return iv.rentValidation();
	}
	
}
