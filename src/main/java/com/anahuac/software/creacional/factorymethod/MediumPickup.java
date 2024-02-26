package com.anahuac.software.creacional.factorymethod;

public class MediumPickup implements CarFactory {

	@Override
	public Car createCar() {
		return new Pickup();
	}

}
