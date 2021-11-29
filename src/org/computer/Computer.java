package org.computer;
//	ChildClass //Single Inheritance
public class Computer extends Desktop{

	private void computerModel() {
		
System.out.println("Computer Model: Dell Latitude");
	}
	public static void main(String[] args) {
		
		Computer a=new Computer();
		a.computerModel();
		System.out.println("\n");
		a.desktopSize();
		System.out.println("Modified by Dev");
		System.out.println("Dev ");
	}
}
