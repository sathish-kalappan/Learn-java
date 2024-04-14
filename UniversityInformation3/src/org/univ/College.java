package org.univ;

public class College extends University {
	@Override
	public void ug() {
		System.out.println("UG : SLCET");
		super.ug();
	}
	@Override
	public void pg() {
		System.out.println("PG : Kings College");
		super.pg();
	}
	public static void main(String[] args) {
		College c = new College();
		c.ug();
		c.pg();
	}
	

}
