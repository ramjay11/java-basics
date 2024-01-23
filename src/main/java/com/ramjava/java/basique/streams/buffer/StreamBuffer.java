package com.ramjava.java.basique.streams.buffer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@SpringBootApplication
public class StreamBuffer {

    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(
                new Employee("Huskey", "Saint", 5000.0, List.of(
                        "Project 1", "Project 2"
                )));
        employees.add(
                new Employee("Blackey", "Saint", 5100.0, List.of(
                        "Project 3", "Project 4"
                )));
        employees.add(
                new Employee("Siber", "Saint", 5200.0, List.of(
                        "Project 5", "Project 6"
                )));
    }
    public static void main(String[] args) {
        //SpringApplication.run(StreamBuffer.class, args);

        // Imperative style - for, while loop

        //Stream.of(employees); // Stream of object (list of object)
        // this now is a stream of objects
        // foreach
        employees.stream()
                .forEach(employee -> System.out.println(employee));

        // Intermediate operations
        // map, collect by chaining of operations. Increase salary by 10%
        // instead of toList, you could use toSet as well
        List<Employee> increaseSalary = employees.stream()
                .map(employee -> new Employee(
                        employee.getFirstname(),
                        employee.getFirstname(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList()); // collect data to the list
        System.out.println(increaseSalary);

        // Filter operation. If it's returning the stream, it's an intermediate operation
        List<Employee> filterEmployee = employees.stream()
                .filter(employee -> employee.getSalary() > 5000.0)
                .map(employee -> new Employee(
                        employee.getFirstname(),
                        employee.getLastname(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList());
        System.out.println(filterEmployee);

    }
}
