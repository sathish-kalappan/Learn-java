package org.phone;

public class Phone {
	private void phoneInfo() {
		System.out.println("Phone name");

	}
	public void phoneInfo(int model , String country) {
		System.out.println("Ph model:"+model);
		System.out.println("Ph madein:"+country);
	}
	private void phoneInfo(String storage , int rate) {
		System.out.println("Ph storage:"+storage);
		System.out.println("Ph rate:"+rate);
		
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo();
		p.phoneInfo(1100, "India");
		p.phoneInfo("1TB", 25000);
		
	}

}
