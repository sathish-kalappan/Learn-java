package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("CompanyDetails");
		

	}
	
	public void companyName(String name) {
		System.out.println("Company name:"+name);
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyName("Classic Tech");
		
		
	}

}
