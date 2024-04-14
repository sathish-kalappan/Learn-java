package org.bank;

public class BankInfo {
	private void fullName() {
		System.out.println("FullName : Sathishkalappan");

	}
	private void sortCode() {
		System.out.println("Sortcode : hdfc1234");

	}
	private void accountNumber() {
		System.out.println("AccountNumber : 1234567890");
	}
	private void bankAddress() {
		System.out.println("BankAddress : HDFCBank,Pondy ");

	}
	public static void main(String[] args) {
		BankInfo info = new BankInfo();
		
		info.fullName();
		info.sortCode();
		info.accountNumber();
		info.bankAddress();
	}

}
