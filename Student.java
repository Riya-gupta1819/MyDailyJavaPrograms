package com.riya.equals;

public class Student {
	
	 int id;
	    Student(int id) { this.id = id; }

	    @Override
	    public boolean equals(Object o) {
	        Student s = (Student) o;
	        return this.id == s.id;
	    }

	public static void main(String[] args) {
		Student s1 = new Student(1);
        Student s2 = new Student(1);
        System.out.println(s1.equals(s2));

	}

}
