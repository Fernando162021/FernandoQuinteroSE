package com.anahuac.software.creacional.factorymethod;

public class SedanCar implements Car {

	@Override
	public void addBody() {
		System.out.println("Adding sedan car body");
	}

	@Override
	public void addDoors() {
		System.out.println("Adding sedan car doors"); 
	}

	@Override
	public void paint() {
		System.out.println("Painting sedan car");

	}

}
