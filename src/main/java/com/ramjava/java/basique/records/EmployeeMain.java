package com.ramjava.java.basique.records;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass("Blackey", 12345);
        //System.out.println(employeeClass.getName());
        EmployeeRecord employeeRecord = new EmployeeRecord("Huskey", 123456);
        System.out.println(employeeRecord.name());
    }
}
