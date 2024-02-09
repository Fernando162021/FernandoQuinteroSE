package com.anahuac.software.creacional.factorymethod;

public class ElectricCar implements Car {

	@Override
	public void addBody() {
		System.out.println("Adding electric car body");

	}

	@Override
	public void addDoors() {
		System.out.println("Adding electric car doors");
	}

	@Override
	public void paint() {
		System.out.println("Painting electric car");
	}

}
