package com.anahuac.software.estructural.decorator;

public class HBO extends PackageDecorator{

	public HBO(Package packageItem) {
		super(packageItem);
	}
	
	@Override
	public double cost() {
		return super.cost() + 100;
	}
}
