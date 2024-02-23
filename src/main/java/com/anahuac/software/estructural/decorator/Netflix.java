package com.anahuac.software.estructural.decorator;

public class Netflix extends PackageDecorator{

	public Netflix(Package packageItem) {
		super(packageItem);
	}
	@Override
	public double cost() {
        return super.cost() + 50;
    }
}
