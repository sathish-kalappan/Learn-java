package org.computer;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("DesktopSize : 14inch");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		
		d.desktopSize();
		d.computerModel();
	}

}
