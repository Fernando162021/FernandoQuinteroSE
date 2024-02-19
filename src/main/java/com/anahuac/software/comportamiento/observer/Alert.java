package com.anahuac.software.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Alert implements Observer{
	
	private Item item;
	private double desiredPrice;
	private List<Delivery> deliveries;
	
	public Alert(Item item, double desiredPrice) {
		this.item = item;
		this.desiredPrice = desiredPrice;
		this.deliveries = new ArrayList<>();
		item.addObserver(this);
	}
	
	private void sendAlert() {
		String message = "The item " + item.getName() + 
				" has reached the desired price (" + this.desiredPrice + ")";
		for(Delivery delivery : deliveries) {
			delivery.send(message);
		}
	}
	
	@Override
	public void update(double price) {
		if(price <= this.desiredPrice) {
			sendAlert();
		}
	}
	
	public void addDelivery(Delivery delivery) {
        deliveries.add(delivery);
    }

    public void removeDelivery(Delivery delivery) {
        deliveries.remove(delivery);
    }

}
