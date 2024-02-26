package com.anahuac.software.estructural.adapter;

public class LegacyEmployee {
	private String name;
	private String lastName;
	private String birthday;
	
	public LegacyEmployee(String name, String lastName, String birthday) {
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBirthday() {
		return birthday;
	}
	
}
