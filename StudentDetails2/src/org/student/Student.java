package org.student;

import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur id ??");
		int id = s.nextInt();
		System.out.println("Enter ur name ??");
		String name = s.next();
		System.out.println("Enter ur email ??");
		String email = s.next();
		System.out.println("Enter ur phone ??");
		long phone = s.nextLong();
		System.out.println("Enter ur dept ??");
		String dept = s.next();
		System.out.println("Enter ur gender ??");
		String gender = s.next();
		System.out.println("Enter ur city ??");
		String city = s.next();
		
		System.out.println("Student Name:"+name);
		System.out.println("Student Id:"+id);
		System.out.println("Student Email:"+email);
		System.out.println("Student Phone:"+phone);
		System.out.println("Student Dept:"+dept);
		System.out.println("Student Gender:"+gender);
		System.out.println("Student City:"+city);
		
	}
	

}
