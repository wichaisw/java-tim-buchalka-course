package com.company.exercise;

public class Vehicle {
	private String name;
	private int engine;
	private double weight;
	private int size;
	
	public Vehicle() {
		this("dang", 1, 50.00d, 50);
	}
	
	public Vehicle(String name, int engine, double weight, int size) {
		this.name = name;
		this.engine = engine;
		this.weight = weight;
		this.size = size;
	}	
	
	public void changeGear() {
		System.out.println("The vehicle is changing gear");
	}
	
	public void move(int speed) {
		System.out.println("It's moving at " + speed);
	}

	public String getType() {
		return name;
	}

	public int getEngine() {
		return engine;
	}

	public double getWeight() {
		return weight;
	}

	public int getSize() {
		return size;
	}

	
}
