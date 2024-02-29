package com.anahuac.software.partialexam.first;

public class DatabaseB extends Database {

	@Override
	public String createStatement() {
		return "insert into " + queryData.getTableName().toLowerCase() + " (" + String.join(", ", queryData.getColumns()) + ") values (" + String.join(", ", queryData.getValues()) + ")";
	}

}
