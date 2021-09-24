package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentNmae()
	{
		System.out.println("Student name");
	}
	
	public void studentID()
	{
		System.out.println("Student id");
		
	}
	public void studentDept()
	{
		System.out.println("Student Department");
	}
	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.CollageCode();
		s1.CollageName();
		s1.CollageRank();
		s1.deptName();
		s1.studentDept();
		s1.studentID();
		s1.studentNmae();
	}
}
