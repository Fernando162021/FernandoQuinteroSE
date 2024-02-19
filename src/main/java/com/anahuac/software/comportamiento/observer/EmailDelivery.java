package com.anahuac.software.comportamiento.observer;

public class EmailDelivery implements Delivery {
	
	private String emailAddress;
	
	public EmailDelivery(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public void send(String message) {
		System.out.println("Delivering alert via email to " + emailAddress + ": " + message);
	}

}
