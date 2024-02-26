package com.anahuac.software.creacional.factorymethod;

public class HighPickup implements CarFactory {
	
	@Override
	public Car createCar() {
		return new Pickup();
	}
	
}
