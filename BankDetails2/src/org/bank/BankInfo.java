package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("Saving : 50000");

	}
	private void fixed() {
		System.out.println("Fixed : 40000");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		
		b.saving();
		b.fixed();
		b.depodit();
		
	}

}
