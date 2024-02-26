package com.anahuac.software.creacional.factorymethod;

public class HighSedan implements CarFactory {

	@Override
	public Car createCar() {
		return new SedanCar();
	}
	
}
