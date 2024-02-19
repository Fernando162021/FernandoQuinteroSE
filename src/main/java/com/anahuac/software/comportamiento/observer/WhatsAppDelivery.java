package com.anahuac.software.comportamiento.observer;

public class WhatsAppDelivery implements Delivery {
	private String phoneNumber;
	
	public WhatsAppDelivery(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Delivering alert via WhatsApp to " + phoneNumber + ": " + message);
	}

}
