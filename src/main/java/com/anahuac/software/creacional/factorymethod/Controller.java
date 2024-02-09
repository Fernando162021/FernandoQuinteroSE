package com.anahuac.software.creacional.factorymethod;

public class Controller {
	public static void assembleCar(CarFactory factory) {
		Car car = factory.createCar();
		car.addBody();
		car.addDoors();
		car.paint();
	}
	
	public static void main(String[] args) {
		// Assemble different types of cars
        System.out.println("Assembling Sedan Car:");
        assembleCar(new SedanCarFactory());

        System.out.println("\nAssembling Electric Car:");
        assembleCar(new ElectricCarFactory());

        System.out.println("\nAssembling Pickup:");
        assembleCar(new PickupFactory());
	}
}
