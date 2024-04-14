package org.edu;

public class Arts extends Education {
	private void bSc() {
		System.out.println("BSc : 30");

	}
	private void bEd() {
		System.out.println("BEd : 20");

	}
	private void bA() {
		System.out.println("BA : 25");

	}
	 private void bBA() {
		System.out.println("BBA : 15");
	}
	 @Override
	public void ug() {
		System.out.println("UG : 80");
		super.ug();
	}
	 @Override
	public void pg() {
		System.out.println("PG : 60");
		super.pg();
	}
	 public static void main(String[] args) {
		Arts a = new Arts();
		a.bSc();
		a.bEd();
		a.bA();
		a.bBA();
		a.ug();
		a.pg();
		
	}

}
