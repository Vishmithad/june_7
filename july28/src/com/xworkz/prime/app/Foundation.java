package com.xworkz.prime.app;

public class Foundation extends Lakme{
	private int weight;
	private  double price ;
	
	
	public Foundation(String brand,double Lakmeprice,int weight, double price) {
		super(brand,Lakmeprice);
		this.weight = weight;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("weight :"+weight);
		System.out.println("price :"+price);
	}

}


