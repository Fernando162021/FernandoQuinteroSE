package com.anahuac.software.comportamiento.template;

public abstract class Logger {
	
	protected Event e;
	
    public final void log() {
    	open();
    	String log = format();
    	write(log);
    	close();
    }
	
	public abstract void open();
	
	public abstract String format();
	
	public abstract void write(String log);
	
	public abstract void close();
	
	public void setEvent(Event e) {
		this.e = e;
	}
}
