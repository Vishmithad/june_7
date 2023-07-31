package com.xworkz.prime.app;

public class Clothes {
	private String brand;
	private double price;
	
	public Clothes(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
	
	public void printInfo() {
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
	}
}

