package com.xworkz.prime.app;

public class Lizards extends Reptiles {
	private int age;
	private String color;
	
	public Lizards(String name, String kingdom, int age, String color) {
		super(name,kingdom);
		this.age = age;
		this.color = color;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("class :"+age);
		System.out.println("color :"+color);

	}
	

}



