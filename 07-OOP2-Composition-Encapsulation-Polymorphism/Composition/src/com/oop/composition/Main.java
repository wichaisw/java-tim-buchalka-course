package com.oop.composition;

public class Main {
	
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("20208", "Lenovo", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inches Beast", "Acer", 27, new Resolution(2540, 1440));
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Dell", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
//		thePC.getMonitor().drawPixelAt(200, 500, "green");
//		thePC.getMotherboard().loadProgram("Undertale");
//		thePC.getTheCase().pressPowerButton();
		
		thePC.powerUp();
	}

}
