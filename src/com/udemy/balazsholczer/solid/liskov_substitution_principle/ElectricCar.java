package com.udemy.balazsholczer.solid.liskov_substitution_principle;

public class ElectricCar implements ElectricVehicle {

	@Override
	public void speed() {
		System.out.println("Speed up with electric car...");
	}

	@Override
	public void chargeBattery() {
		System.out.println("Charging the battery...");
	}
}
