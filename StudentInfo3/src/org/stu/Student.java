package org.stu;

public class Student {
	private void studentId() {
		System.out.println("StudentInfo");
	}
	private void studentId(int id) {
		System.out.println("Stu id:"+id);
	}
	private void studentId(String name , long regNum) {
		System.out.println("Stu Name:"+name);
		System.out.println("Stu RegNum:"+regNum);
	}
	private void studentId(int marks , String schoolname) {
		System.out.println("Stu Marks:"+marks);
		System.out.println("stu school:"+schoolname);
		
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.studentId();
		s.studentId(1234);
		s.studentId("Ravi", 822011114036l);
		s.studentId(558, "KHSS");
		
	}

}
