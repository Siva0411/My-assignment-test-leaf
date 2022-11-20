package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("sankari");		
	}

	public void studentDept() {
		System.out.println("CSE B");
	}
	
	public void studentId() {
		System.out.println("70100");
	}
	
	public static void main(String[] args) {
		
		Student sd = new Student();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.deptName();
		sd.studentName();
		sd.studentDept();
		sd.studentId();

	}
 

}
