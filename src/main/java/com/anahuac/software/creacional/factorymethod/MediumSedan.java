package com.anahuac.software.creacional.factorymethod;

public class MediumSedan implements CarFactory {

	@Override
	public Car createCar() {
		return new SedanCar();
	}
	
}
