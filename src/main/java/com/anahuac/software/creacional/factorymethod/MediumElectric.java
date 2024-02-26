package com.anahuac.software.creacional.factorymethod;

public class MediumElectric implements CarFactory{

	@Override
	public Car createCar() {
		return new ElectricCar();
	}
	
}
