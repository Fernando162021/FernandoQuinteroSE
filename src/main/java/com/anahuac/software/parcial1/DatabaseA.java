package com.anahuac.software.parcial1;

public class DatabaseA extends Database {

	@Override
	public String createStatement() {
		return "INSERT INTO " + queryData.getTableName().toUpperCase() + " (" + String.join(", ", queryData.getColumns()) + ") VALUES (" + String.join(", ", queryData.getValues()) + ")";
	}

}
