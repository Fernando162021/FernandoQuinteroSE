package com.anahuac.software.creacional.factorymethod;

public class ElectricCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new ElectricCar();
	}

}
