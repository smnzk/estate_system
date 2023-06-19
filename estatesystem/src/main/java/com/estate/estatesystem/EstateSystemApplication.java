package com.estate.estatesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstateSystemApplication {

	//spring.jpa.hibernate.ddl-auto=update
	//spring.datasource.url=jdbc:mysql://localhost:3306/mas?useSSL=false
	//spring.datasource.username=
	//spring.datasource.password=
	//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	//#spring.jpa.show-sql: true

	public static void main(String[] args) {
		SpringApplication.run(EstateSystemApplication.class, args);
	}

}
