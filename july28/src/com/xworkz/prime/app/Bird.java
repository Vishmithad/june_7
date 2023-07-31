package com.xworkz.prime.app;

public class Bird extends Reptiles{
	private String birdName;
	private String color;
	
	public Bird(String name, String kingdom, String birdName, String color) {
		super(name,kingdom);
		this.birdName = birdName;
		this.color = color;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("birdName :"+birdName);
		System.out.println("color :"+color);

	}
	

}

