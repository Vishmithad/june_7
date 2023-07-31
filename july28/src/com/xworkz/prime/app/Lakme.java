package com.xworkz.prime.app;

public class Lakme {
	private String brand;
	private  double Lakmeprice ;
	
	
	public Lakme(String brand, double Lakmeprice) {
		super();
		this.brand = brand;
		this.Lakmeprice = Lakmeprice;
	}
	
	public void printInfo() {
		System.out.println("brand :"+brand);
		System.out.println("price :"+Lakmeprice);
	}

}

