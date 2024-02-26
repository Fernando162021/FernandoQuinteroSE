package com.anahuac.software.estructural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	public static void main(String[] args) {
        LegacyEmployee legacyEmployee1 = new LegacyEmployee("John", "Doe", "1990/01/01");
        LegacyEmployee legacyEmployee2 = new LegacyEmployee("Jane", "Smith", "1985/05/15");

        Employee newEmployee1 = new LegacyEmployeeAdapter(legacyEmployee1);
        Employee newEmployee2 = new LegacyEmployeeAdapter(legacyEmployee2);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(newEmployee1);
        employeeList.add(newEmployee2);

        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ", Edad: " + employee.getAge());
        }
    }
}
