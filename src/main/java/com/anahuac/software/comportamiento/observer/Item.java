package com.anahuac.software.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private String name;
	private double currentPrice;
	private List<Observer> observers;
	
	public Item(String name, double currentPrice) {
		this.name = name;
		this.currentPrice = currentPrice;
		this.observers = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
		notifyObservers();
	}
	
	public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

	private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentPrice);
        }
    }
}
