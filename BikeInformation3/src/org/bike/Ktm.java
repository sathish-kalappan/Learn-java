package org.bike;

public class Ktm implements Bike {
	@Override
	public void cost() {
		System.out.println("cost : 3lakhs");
		
	}
	@Override
	public void speed() {
		System.out.println("speed : 180Km/hr");
		
	}
	public static void main(String[] args) {
		Ktm k= new Ktm();
		k.cost();
		k.speed();
		
		
	}

}
