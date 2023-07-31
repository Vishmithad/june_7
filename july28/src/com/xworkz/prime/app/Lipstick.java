package com.xworkz.prime.app;

public class Lipstick extends Lakme{
	private String color;
	private  double price ;
	
	
	public Lipstick(String brand,double Lakmeprice,String color, double price) {
		super(brand,Lakmeprice);
		this.color = color;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("color :"+color);
		System.out.println("price :"+price);
	}

}



