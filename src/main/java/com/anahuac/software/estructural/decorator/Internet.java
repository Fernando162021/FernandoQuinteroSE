package com.anahuac.software.estructural.decorator;

public class Internet extends PackageDecorator{

	public Internet(Package packageItem) {
		super(packageItem);
	}
	
	@Override
    public double cost() {
        return super.cost() + 250;
    }
}
