package com.anahuac.software.partialexam.first;

public class Controller {
	public static void main(String[] args) {
		String tableName = "MyTable";
        String[] columns = {"Column1", "Column2"};
        String[] values = {"Value1", "Value2"};
        QueryData queryData = new QueryData(tableName, columns, values);

        Database databaseA = new DatabaseA();
        databaseA.setQueryData(queryData);
        
        Database databaseB = new DatabaseB();
        databaseB.setQueryData(queryData);

        Database databaseC = new DatabaseC();
        databaseC.setQueryData(queryData);
        
        databaseA.peristData();
        databaseB.peristData();
        databaseC.peristData();
	}
}
