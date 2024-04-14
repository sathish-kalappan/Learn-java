package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("WifiName : BSNL");

	}
	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();
		MobileData d = new MobileData();
		d.dataName();
		Lan l = new Lan();
		l.lanName();
		Wireless wi = new Wireless();
		wi.modemName();
		
	}

}
