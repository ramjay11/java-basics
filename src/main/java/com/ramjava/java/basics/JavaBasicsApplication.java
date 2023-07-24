package com.ramjava.java.basics;

import com.ramjava.java.basics.records.EmployeeClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaBasicsApplication.class, args);
		EmployeeClass employee1 = new EmployeeClass("Blackey Saint", 12345);
	}

}
