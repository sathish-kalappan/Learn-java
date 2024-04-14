package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("EmpName : Kumar");

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		Company c = new Company();
		c.companyName();
		Client cl = new Client();
		cl.clientName();
		Project p = new Project();
		p.projectName();
	}

}
