package com.anahuac.software.estructural.adapter;

import java.time.LocalDate;
import java.time.Period;

public class LegacyEmployeeAdapter implements Employee {
	
	private LegacyEmployee legacyEmployee;
	
	public LegacyEmployeeAdapter(LegacyEmployee legacyEmployee){
		this.legacyEmployee = legacyEmployee;
	}
	
	@Override
	public String getName() {
		return (legacyEmployee.getName() + " " + legacyEmployee.getLastName());
	}
	
	private int dateToAge() {
		String birthdayString;
		String[] splittedString;
		
		birthdayString = legacyEmployee.getBirthday(); 
		splittedString = birthdayString.split("/");
		
	    int year = Integer.parseInt(splittedString[0]);
	    int month = Integer.parseInt(splittedString[1]);
		int day = Integer.parseInt(splittedString[2]);
	      
		LocalDate currentDate = LocalDate.now();
		LocalDate date = LocalDate.of(year, month, day);
		Period period = Period.between(date, currentDate);
		
		return period.getYears();
	}
	
	@Override
	public int getAge() {
		return dateToAge();
	}

}
