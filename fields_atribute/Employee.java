package com.riya.fields_atribute;

public class Employee {
	int employeeNumber;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeDetails(int id, String name, double salary)
	{
		employeeNumber=id;
		employeeName=name;
		employeeSalary=salary;
	}
	
	public void calculateSalaryIncrement()
	{
		if(employeeSalary<50000)
		{
			employeeSalary=employeeSalary+(employeeSalary*10/100);
		}
		else if(employeeSalary>50000 && employeeSalary<80000)
		{
			employeeSalary=employeeSalary+(employeeSalary*7/100);
		}
		else if(employeeSalary>80000)
		{
			employeeSalary=employeeSalary+(employeeSalary*5/100);
		}
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("employee id is :"+employeeNumber);
		System.out.println("employee name is :"+employeeName);
		System.out.println("employee salary is :"+employeeSalary);
	}

}
