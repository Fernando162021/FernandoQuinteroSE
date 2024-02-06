package com.anahuac.software.creacional.singleton;

public class Logger {
	private static Logger ins;
	
	private Logger() {}
	
	public static Logger getInstance() {
        if (ins == null) {
            ins = new Logger();
        }
        return ins;
    }
	
	public void logError(String message) {
        log("ERROR", message);
    }

    public void logInfo(String message) {
        log("INFO", message);
    }

    public void logWarning(String message) {
        log("WARNING", message);
    }
    
    private void log(String severity, String message) {
        System.out.println(severity + ": " + message);
    }
}
