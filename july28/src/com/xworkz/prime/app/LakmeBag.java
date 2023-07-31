package com.xworkz.prime.app;

public class LakmeBag extends Lakme{
	private String color;
	private  double price ;
	
	
	public LakmeBag(String brand,double Lakmeprice,String color, double price,int weight) {
		super(brand,Lakmeprice);
		this.color = color;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("color :"+color);
		System.out.println("price :"+price);
	}
}



