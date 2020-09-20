package com.company.exercise;

public class Delorean extends Car {
	boolean cool;
	
	public Delorean() {
		super();
		this.cool = true;
	}
	
	private void timeTravel() {
		System.out.println("Delorean is time traveling, doc!");
	}
	
	@Override
	public void move(int speed) {
		timeTravel();
	}
}
