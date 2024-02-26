package com.anahuac.software.estructural.decorator;

public class Controller {
	public static void main(String[] args) {
		Package packageItem = new BasicPackage();
        packageItem = new Internet(packageItem);
        packageItem = new Netflix(packageItem);
        packageItem = new Disney(packageItem);
        System.out.println("Total cost of the package: $" + packageItem.cost());        
	}
}
