package com.xworkz.prime.app;

public class NewsPaper {
	private String name;
	private int noOfPages;
	private double price;
	private String brand;
	private String type;
	@Override
		public String toString() {
			return "name:" + this.name + " noOfPages: " + this.noOfPages + " price: " + this.price +  " brand : "+this.brand + " type :"+this.type;
		} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
	}





