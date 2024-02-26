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
        System.out.println("Assembling Basic Sedan Car:");
        assembleCar(new BasicSedan());
        System.out.println("\nAssembling Medium Sedan Car:");
        assembleCar(new MediumSedan());
        System.out.println("\nAssembling High Sedan Car:");
        assembleCar(new HighSedan());
        
        System.out.println("Assembling Basic Electric Car:");
        assembleCar(new BasicElectric());
        System.out.println("\nAssembling Medium Electric Car:");
        assembleCar(new MediumElectric());
        System.out.println("\nAssembling High Electric Car:");
        assembleCar(new HighElectric());
        
        System.out.println("Assembling Basic Pickup Car:");
        assembleCar(new BasicPickup());
        System.out.println("\nAssembling Medium Pickup Car:");
        assembleCar(new MediumPickup());
        System.out.println("\nAssembling High Pickup Car:");
        assembleCar(new HighPickup());
	}
}
