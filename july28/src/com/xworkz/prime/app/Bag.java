package com.xworkz.prime.app;

public class Bag {
	private String brandName;
	private String color;       
	private String bagType;
	private double price;
	private boolean quality;
	
	public Bag() {
		System.out.println("Running no argument constructor of Bag");
	}
	
	public Bag(String brandName, String color, String bagType) {
		System.out.println("Running string, string, string constructor of Bag...");
		this.brandName = brandName;
		this.color = color;
		this.bagType = bagType;
	}

	public Bag(String brandName, String color, String shirtType, double price, boolean quality) {
		this(brandName, color, shirtType);
		System.out.println("Running string, string, string, double, boolean, char constructor of Bag...");
		this.price = price;
		this.quality = quality;
	}


	@Override
	public String toString() {
		return "brandName=" + brandName + "\n" + "color=" + color + "\n" + "shirtType=" + bagType + "\n" + 
				"price=" + price+ "\n" + "quality=" + quality ;
	}
	
	
	
	
}
	

