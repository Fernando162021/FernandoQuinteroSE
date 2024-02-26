package com.anahuac.software.creacional.factorymethod;

public class BasicPickup implements CarFactory {
	
	@Override
	public Car createCar() {
		return new Pickup();
	}

}
