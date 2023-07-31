package com.xworkz.prime.app;

public class Shop extends Clothes{
	private String shopName;
	private String location;
	
	public Shop(String brand, double price, String shopName, String location) {
		super(brand, price);
		this.shopName = shopName;
		this.location = location;
		
		
	}

	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("shopName :"+shopName);
		System.out.println("location:"+location);
		
	}
	
	
	}

