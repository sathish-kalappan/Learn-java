package org.college;

public class college {
	private void collegeName() {
		System.out.println("CollegeName : RAAK College of Engineering");

	}
	private void collegeId() {
		System.out.println("CollegeId : 12345");

	}
	private void collegeRank() {
		System.out.println("CollegeRank : 3");

	}
	public static void main(String[] args) {
		college c = new college();
		c.collegeName();
		c.collegeId();
		c.collegeRank();
		
		student s = new student();
		s.studentNamr();
		s.studentId();
		s.studentDept();
		
		Hostel ho = new Hostel();
		ho.hostelName();
		
		Dept de = new Dept();
		de.deptName();
		
		
		
	}

}
