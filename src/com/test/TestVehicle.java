package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.model.Car;
import com.model.Vehicle;

class TestVehicle {

	@Test
	void test() {
		Vehicle vehicle = new Car ("BV 01 ABC", "Toyota", 400, 5000, LocalDate.now(), 2, "Hybrid");
		assertFalse(vehicle.rentValidation());
		assertEquals(false, vehicle.rentValidation());
	}

}
