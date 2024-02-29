package com.anahuac.software.parcial1;

public abstract class Database {
	
	protected QueryData queryData;
	
	public final void peristData() {
		openConnection();
		String statement = createStatement();
		executeStatement(statement);
	}
	
	public void openConnection() {
		System.out.println("Opening connection...");
	}
	
	public abstract String createStatement();
	
	public void executeStatement(String statement) {
		System.out.println("Executing statement: " + statement);
	}
	public void setQueryData(QueryData queryData) {
		this.queryData = queryData;
	}
}
