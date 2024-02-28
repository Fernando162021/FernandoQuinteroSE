package com.anahuac.software.comportamiento.template;

import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Event event = new Event(date, time, "INFO", "mi mensaje");
        
        Logger txtLogger = new TxtLogger();
        Logger csvLogger = new CsvLogger();
        Logger jsonLogger = new JsonLogger();
        
        txtLogger.setEvent(event);
        csvLogger.setEvent(event);
        jsonLogger.setEvent(event);
        
        txtLogger.log();
        csvLogger.log();
        jsonLogger.log();
	}
}
