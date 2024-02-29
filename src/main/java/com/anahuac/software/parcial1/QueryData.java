package com.anahuac.software.parcial1;

public class QueryData {
	
	private String tableName;
	private String[] columns;
	private String[] values;
	
	public QueryData(String tableName, String[] columns, String[] values) {
		this.tableName = tableName;
		this.columns = columns;
		this.values = values;
	}

	public String getTableName() {
		return tableName;
	}

	public String[] getColumns() {
		return columns;
	}

	public String[] getValues() {
		return values;
	}
	
}
