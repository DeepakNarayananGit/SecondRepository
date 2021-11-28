package org.computer;
//child Class
public class Desktop1 implements Software,Hardware{

	private void desktopModel() {
		
System.out.println("Desktop Model : Dell Vostro 212");
	}

	@Override
	public void hardwareResources() {
		
System.out.println("Hardware resources: MotherBoard,Processor,Harddisk,Ram,SMPS,Sata Cable");		
	}

	@Override
	public void softwareResources() {
		
	System.out.println("Software Resources : Operating System , Ms Office , Other Required Applications");	
	}
	public static void main(String[] args) {
		
		Desktop1 a=new Desktop1();
		a.desktopModel();
		a.hardwareResources();
		a.softwareResources();
	}
}
