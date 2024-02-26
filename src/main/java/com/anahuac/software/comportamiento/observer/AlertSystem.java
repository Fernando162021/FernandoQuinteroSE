package com.anahuac.software.comportamiento.observer;

public class AlertSystem {
	public static void main(String[] args) {
		
        Item item = new Item("Smartphone", 500);
        Alert alert = new Alert(item, 400);
        
        alert.addDelivery(new BrowserDelivery());
        alert.addDelivery(new EmailDelivery("example@example.com"));
        alert.addDelivery(new WhatsAppDelivery("+1234567890"));

        item.setCurrentPrice(400);
	}
}
