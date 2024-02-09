package com.anahuac.software.creacional.factorymethod;

public class Pickup implements Car {

	@Override
	public void addBody() {
		System.out.println("Adding pickup body");
	}

	@Override
	public void addDoors() {
		System.out.println("Adding pickup doors");
	}

	@Override
	public void paint() {
		System.out.println("Painting pickup");
	}

}
