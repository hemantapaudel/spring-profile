package com.spring.application.conditional.beans;

import java.sql.Connection;



public class OracleConnectionFactory implements ConnectionFactory{

	// this will connected with Oracle  db
	@Override
	public Connection getConnection() {
		return null;
	}
	
	@Override
	public String toString() {
		return "Oracle Connection Factory";
	}

}
