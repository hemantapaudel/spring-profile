
package com.spring.application.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.spring.application.conditional.beans.ConnectionFactory;
import com.spring.application.conditional.beans.OracleConnectionFactory;
import com.spring.application.conditional.beans.SQLConnectionFactory;

@Configuration
public class DataSourceConfig {

	
	  @Bean(name="connectionFactory")
	  @Conditional(value=DevDataSourceCondition.class)
	  public ConnectionFactory getConnectionFactory() {
		  return new SQLConnectionFactory();
	  }

	  @Bean(name="connectionFactory")
	  @Conditional(QaDataSourceCondtion.class)
	  public ConnectionFactory connectionFactory() {
		  return new OracleConnectionFactory();
	  }
	
	
}

