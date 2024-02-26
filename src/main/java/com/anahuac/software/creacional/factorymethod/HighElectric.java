package com.anahuac.software.creacional.factorymethod;

public class HighElectric implements CarFactory{

	@Override
	public Car createCar() {
		return new ElectricCar();
	}
	
}
