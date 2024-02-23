package com.anahuac.software.estructural.decorator;

public class Disney extends PackageDecorator{

	public Disney(Package packageItem) {
		super(packageItem);
	}
	
	@Override
	public double cost() {
		return super.cost() + 100;
	}
}
