package com.company.exercise;

public class Car extends Vehicle {
	private int wheel;
	private boolean horn;
	
	public Car() {
		super();
		this.wheel = 4;
		this.horn = true;
	}
	
	public Car(int wheel, boolean horn) {
		super();
		this.wheel = wheel;
		this.horn = horn;
	}
	
	public Car(String name, int engine, double weight, int size, int wheel, boolean horn) {
		super(name, engine, weight, size);
		this.wheel = wheel;
		this.horn = horn;
	}
	
	private void handSteer() {
		
	}
	
	@Override
	public void changeGear() {
		System.out.println("Car is changing gear");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Car is moving at " + speed);
	}

	public int getWheel() {
		return wheel;
	}

	public boolean isHorn() {
		return horn;
	}
	
	
}
