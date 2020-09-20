package com.company.exercise;

public class Main {
	
	public static void main(String[] args) {
		Delorean delorean = new Delorean();
		delorean.move(1200);
		
		delorean.changeGear();
		
		System.out.println(delorean.getWheel());
	}
}
