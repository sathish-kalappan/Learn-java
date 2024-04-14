package org.emp;

public class EmployeeInfo {
private void empId() {
	System.out.println("EmpId : 1234");
	
}
private void empName() {
	System.out.println("EmpName : Sathish");

}
private void empDob() {
	System.out.println("EmpDob : 11/02/1994");

}
private void empPhone() {
	System.out.println("EmpPhone : 9600632172");

}
private void empEmail() {
	System.out.println("EmpEmail : pavisathi38@gmail.com");

}
private void empAdress() {
	System.out.println("EmpAdress : Puducherry");
}
public static void main(String[] args) {
	
	EmployeeInfo emp = new EmployeeInfo();
	emp.empName();
	emp.empId();
	emp.empDob();
	emp.empPhone();
	emp.empEmail();
	emp.empAdress();
	
}
}