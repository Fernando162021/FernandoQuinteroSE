package com.anahuac.software.creacional.factorymethod;

public class SedanCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new SedanCar();
	}

}
