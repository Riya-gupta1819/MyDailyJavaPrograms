package com.riya.employee;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the last name : ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter id name : ");
		int employeeId = sc.nextInt();
		
		System.out.println("Enter salary  : ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter the  number of projects : ");
		int noOfProject = sc.nextInt();
		
		Employee e = new Employee();
		e.setEmoloyeeData(firstName, lastName, employeeId, salary, noOfProject);
		e.calculateSalary();
		e.displayDetails();
		
		
		sc.close();

	}

}
