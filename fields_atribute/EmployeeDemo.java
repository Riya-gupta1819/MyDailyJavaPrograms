package com.riya.fields_atribute;

import java.util.Scanner;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int employeeNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter employee name : ");
		String employeeName = sc.nextLine();
		
		
		System.out.println("Enter employee salary : ");
		double employeeSalary = sc.nextDouble();
		
		Employee e = new Employee();
		
		
		e.setEmployeeDetails(employeeNumber, employeeName, employeeSalary);
		e.calculateSalaryIncrement();
		e.getEmployeeDetails();
		
		

	}

}
