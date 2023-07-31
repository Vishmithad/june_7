package com.xworkz.prime.app;

public class FinalMembers {
	private final String perfumesName;
	private final double price;
	private final String brand;
	
	
	public FinalMembers(String perfumesName, double price, String brand) {
		this.perfumesName = perfumesName;
		this.price = price;
		this.brand = brand;
	}
	
	public final void show() {
		System.out.println("perfumesName :"+perfumesName);
		System.out.println("price :"+price);
		System.out.println("brand :"+brand);
		
	}
}
