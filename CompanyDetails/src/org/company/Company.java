package org.company;

public class Company {
	private void companyName() {
		System.out.println("CompanyName : Adhitya Packing Industry");

	}
	private void companyId() {
		System.out.println("CompanyId : 1234567890");

	}
	private void companyAddress() {
		System.out.println("CompanyAddress : Pondicherry");
	}
	public static void main(String[] args) {
		Company c = new Company();
				
				c.companyName();
				c.companyId();
				c.companyAddress();
				
		
	}

}
