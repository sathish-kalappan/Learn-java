package org.mark;

import java.util.Scanner;
public class Mark {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter ur name ??");
		String name = s.next();
		System.out.println("Enter ur regnum ??");
		int regnum = s.nextInt();
		System.out.println("Enter ur mark1 ??");
		int mark1 = s.nextInt();
		System.out.println("Enter ur mark2 ??");
		int mark2 = s.nextInt();
		System.out.println("Enter ur mark3 ??");
		int mark3 = s.nextInt();
		System.out.println("Enter ur mark4 ??");
		int mark4 = s.nextInt();
		System.out.println("Enter ur mark5 ??");
		int mark5 = s.nextInt();
		
		int total = mark1+mark2+mark3+mark4+mark5;
	
		double average = total/5;
		
		System.out.println("Student RegNum:"+regnum);
		System.out.println("Student Name:"+name);
		System.out.println("Mark1:"+mark1);
		System.out.println("Mark2:"+mark2);
		System.out.println("Mark3:"+mark3);
		System.out.println("Mark4:"+mark4);
		System.out.println("Mark5:"+mark5);
		System.out.println("Total:"+total);
		System.out.println("Average:"+total/5);
	}

}
