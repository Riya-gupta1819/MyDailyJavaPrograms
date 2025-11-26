package com.riya.area_of_circle;

import java.util.Scanner;
public class Circle {
	public static double getArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double num = sc.nextDouble();
		sc.close();
		double pi = 3.14;
		
		
			double a = pi*num*num;
			return a ;
		
		
	}

}
