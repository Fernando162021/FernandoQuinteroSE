package com.anahuac.software.creacional.factorymethod;

public class BasicElectric implements CarFactory{

	@Override
	public Car createCar() {
		return new ElectricCar();
	}
	
}
