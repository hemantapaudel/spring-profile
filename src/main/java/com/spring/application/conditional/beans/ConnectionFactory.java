package com.spring.application.conditional.beans;

import java.sql.Connection;

public interface ConnectionFactory {
	
	Connection getConnection();

}
