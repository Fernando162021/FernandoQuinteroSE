package com.anahuac.software.creacional.factorymethod;

public class PickupFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Pickup();
	}

}
