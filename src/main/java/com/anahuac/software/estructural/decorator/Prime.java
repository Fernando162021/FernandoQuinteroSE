package com.anahuac.software.estructural.decorator;

public class Prime extends PackageDecorator{

	public Prime(Package packageItem) {
		super(packageItem);
	}
	
	@Override
	public double cost() {
		return super.cost() + 50;
	}

}
