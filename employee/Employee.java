package com.riya.employee;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	
	public void setEmoloyeeData(String fname, String lname, int id, double sal, int project)
	{
		firstName = fname;
		lastName =  lname;
		employeeId = id;
		salary = sal;
		noOfProject = project;
	}
	public void calculateSalary()
	{
		if(noOfProject>5 && noOfProject<10)
		{
			salary+=5000;
		}
		else if(noOfProject>10 && noOfProject<20)
		{
			salary+=10000;
		}
		else if(noOfProject>20)
		{
			salary+=20000;
		}
	}
	public void displayDetails()
	{
		System.out.println("first name : "+firstName);
		System.out.println("last name : "+lastName);
		System.out.println("employee id :  "+employeeId);
		System.out.println("salary : "+salary);
		System.out.println("projects "+noOfProject);
	}

}
