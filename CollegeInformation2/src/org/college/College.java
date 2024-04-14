package org.college;

public class College extends Student {
	private void collegeName() {
		System.out.println("CollegeName : SMVEC");
	}
	private void collegeCode() {
		System.out.println("Collegecode : 12345");

	}
	private void collegeRank() {
		System.out.println("CollegeRank : 2");

	}
	public static void main(String[] args) {
		College c = new College();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.studentName();
		c.studentId();
		c.studentDept();
		c.hostelName();
		c.deptName();
		
	}

}
