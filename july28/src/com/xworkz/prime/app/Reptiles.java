package com.xworkz.prime.app;

public class Reptiles {
	private String name;
	private String kingdom;
	
	public Reptiles(String name, String kingdom) {
		this.name = name;
		this.kingdom = kingdom;
	}

	public void printInfo() {
		System.out.println("name :"+name);
		System.out.println("kingdom :"+kingdom);
	}
	
}

