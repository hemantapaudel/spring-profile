package com.spring.application.conditional.beans;

import java.sql.Connection;


public class SQLConnectionFactory  implements  ConnectionFactory{

	// this connection will create SQL server
	@Override
	public Connection getConnection() {
		return null;
	}

	@Override
	public String toString() {
		return "SQL Connection Factory";
	}
	
}
