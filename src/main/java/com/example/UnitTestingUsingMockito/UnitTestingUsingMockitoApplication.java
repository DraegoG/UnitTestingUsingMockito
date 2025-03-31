package com.example.UnitTestingUsingMockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UnitTestingUsingMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingUsingMockitoApplication.class, args);
	}

}
