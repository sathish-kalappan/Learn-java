package org.emp;
import java.util.Scanner;

public class Employee {
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
	System.out.println("Enter ur salary ??");
	float salary = s.nextFloat();
	System.out.println("Enter ur gender ??");
	String gender = s.next();
	System.out.println("Enter ur city ??");
	String city = s.next();
	
	System.out.println("Emp Id :"+id);
	System.out.println("Emp Name:"+name);
	System.out.println("Emp Email :"+email);
	System.out.println("Emp Phone :"+phone);
	System.out.println("Emp Salary :"+salary);
	System.out.println("Emp Gender :"+gender);
	System.out.println("Emp City :"+city);
}

}