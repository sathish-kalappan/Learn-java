package org.emo;

public class Employee {
	public void empId() {
		System.out.println("EmployeeDetails");
		
	}
	private void empId(int id , String name) {
		System.out.println("Emp name:"+name);
		System.out.println("Emp id:"+id); 
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empId(1234, "Sathish");
	}
	
	

	

	}
	
		

	

		
	
		
