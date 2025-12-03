package com.riya.student_grade;

import java.util.Scanner;
public class GradeFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student: ");
	    int marks = sc.nextInt();
		
		char m = GradeEvaluator.findGrade(marks);
		System.out.println("Grade:"+m);

	}

}
