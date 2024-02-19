package com.anahuac.software.comportamiento.observer;

public class BrowserDelivery implements Delivery {

	@Override
	public void send(String message) {
		System.out.println("Delivering alert via browser: " + message);
	}

}
