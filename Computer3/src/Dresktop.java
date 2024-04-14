
public class Dresktop implements Hardware, Software {
	private void desktopMode() {
		System.out.println("DesktopMode : Desktop");

	}
	@Override
	public void hardwareResources() {
		System.out.println("HardwareResources : Keyboard");
		
	}
	@Override
	public void softwareResources() {
		System.out.println("SoftwareResources : OS");
		
	}
	public static void main(String[] args) {
		Dresktop d = new Dresktop();
		d.desktopMode();
		d.hardwareResources();
		d.softwareResources();
		
	}

}
