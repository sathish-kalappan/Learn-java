package org.allvechicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vechicle {
	private void vehicleNecessery() {
		System.out.println("Vechiclenecessery : 2,3&4wheeler");
	}
	public static void main(String[] args) {
		Vechicle v = new Vechicle();
		v.vehicleNecessery();
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		ThreeWheeler th = new ThreeWheeler();
		th.Auto();
		FourWheeler f = new FourWheeler();
		f.bus();
		f.car();
		
		
	}

}
