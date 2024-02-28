package com.anahuac.software.comportamiento.template;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
	private LocalDate date;
	private LocalTime time;
	private String type;
	private String msg;
	
	public Event(LocalDate date, LocalTime time, String type, String msg) {
		this.date = date;
		this.time = time;
		this.type = type;
		this.msg = msg;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalTime getTime() {
		return time;
	}

	public String getType() {
		return type;
	}

	public String getMsg() {
		return msg;
	}
	
}
