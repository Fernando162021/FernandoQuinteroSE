package com.anahuac.software.creacional.factorymethod;

public class BasicSedan implements CarFactory {

	@Override
	public Car createCar() {
		return new SedanCar();
	}

}
