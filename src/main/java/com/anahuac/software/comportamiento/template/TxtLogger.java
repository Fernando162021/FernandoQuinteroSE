package com.anahuac.software.comportamiento.template;

public class TxtLogger extends Logger{

	@Override
	public void open() {
		System.out.println("Opening txt log...");
	}

	@Override
	public String format() {
		return e.getDate() + "    " +
	           e.getTime() + "    " +
	           e.getType() + " : \"" +
	           e.getMsg() + "\"";
	}

	@Override
	public void write(String log) {
		System.out.println("Writing txt log: \n" + log);
	}

	@Override
	public void close() {
		System.out.println("Closing txt log...");
	}

}
