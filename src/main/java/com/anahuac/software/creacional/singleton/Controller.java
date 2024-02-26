package com.anahuac.software.creacional.singleton;

public class Controller {
	private Logger logger = Logger.getInstance();

    public void takeAttendance(String studentName, boolean attended, String justification) {
        if (!attended) {
            logger.logError(studentName + " no asistió a clase.");
        } else if (justification != null && !justification.isEmpty()) {
            logger.logWarning(studentName + " tiene una justificación.");
        } else {
            logger.logInfo(studentName + " asistió a clase.");
        }
    }
    public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.takeAttendance("Alumno1", true, "");
		controller.takeAttendance("Alumno2", false, "");
		controller.takeAttendance("Alumno3", true, "Enfermedad");
	}
}
