package com.anahuac.software.comportamiento.template;

public class JsonLogger extends Logger{

	@Override
	public void open() {
		System.out.println("Opening json log...");
	}

	@Override
	public String format() {
		return "[\n{\n    fecha: \"" + e.getDate() + "\",\n" +
	               "    hora: \"" + e.getTime() + "\",\n" +
	               "    tipo: \"" + e.getType() + "\",\n" +
	               "    mensaje: \"" + e.getMsg() + "\"\n" +
	               "},\n]";
	}

	@Override
	public void write(String log) {
		System.out.println("Writing json log: \n" + log);
	}

	@Override
	public void close() {
		System.out.println("Closing json log...");
	}

}
