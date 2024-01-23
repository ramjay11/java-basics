package com.ramjava.java.basique;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JavaBasicsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavaBasicsApplication.class, args);
		//EmployeeClass employee1 = new EmployeeClass("Blackey Saint", 12345);
		List<String> tenStrings = new ArrayList<>();
		tenStrings.add("1");
		tenStrings.add("2");
		tenStrings.add("3");
		tenStrings.add("4");
		tenStrings.add("5");
		tenStrings.add("6");
		tenStrings.add("7");
		tenStrings.add("8");
		tenStrings.add("9");
		tenStrings.add("10");

		// subset
		int subsetSize = tenStrings.size() / 4;

		// divide into 4
		List<List<String>> subsets = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int startIndex = i * subsetSize;
			int endIndex = (i == 3) ? tenStrings.size() : (i + 1) * subsetSize;
			List<String> subset = tenStrings.subList(startIndex, endIndex);
			subsets.add(subset);
		}

		for (int i = 0; i < subsets.size(); i++) {
			System.out.println("Subset " + (i + 1) + ": " + subsets.get(i));
		}


	}

}
