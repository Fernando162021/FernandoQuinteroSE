package com.anahuac.software.estructural.decorator;

public class PackageDecorator implements Package {
	
	protected Package packageItem;
	
	public PackageDecorator(Package packageItem) {
		this.packageItem = packageItem;
	}
	
	@Override
	public double cost() {
		return packageItem.cost();
	}

}
