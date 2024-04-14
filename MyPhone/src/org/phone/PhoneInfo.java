package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("PhoneName : Redmi note 11 pro");

	}
	private void phoneMieiNum() {
		System.out.println("PhoneMieiNum : 1234567890");

	}
	private void camera() {
		System.out.println("Cmera : 100MP");

	}
	private void storage() {
		System.out.println("Storage : 256GB");

	}
	private void osNaame() {
		System.out.println("OSName : MIUI Global 13.0.7 ");
	}
	public static void main(String[] args) {
		PhoneInfo info = new PhoneInfo();
		info.phoneName();
		info.phoneMieiNum();
		info.camera();
		info.storage();
		info.osNaame();
		
	}

}
