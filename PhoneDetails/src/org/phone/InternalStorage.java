package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("ProcessorName : intel");
	

	}
	private void ramSize() {
		System.out.println("RAMSize : 32GB");

	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		
		i.processorName();
		i.ramSize();
		
		ExternalStorage e = new ExternalStorage();
		e.size();
		
	}

}
