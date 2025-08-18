package com.santhiya.assisgment. utilities;
import com.santhiya.assisgnment.employees.Employee;

public class EmployeeUtilities {
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("--------------------------");
    }
    public static void increaseSalary(Employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.setSalary(newSalary);
    }
}