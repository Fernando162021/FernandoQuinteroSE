package com.anahuac.software.parcial1;

public class DatabaseC extends Database {

	@Override
	public String createStatement() {
		return "INSERT INTO " + queryData.getTableName() + " (" + String.join(", ", queryData.getColumns()) + ") VALUES (" + String.join(", ", queryData.getValues()) + ")";
	}

}
