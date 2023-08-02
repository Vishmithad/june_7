package com.xworkz.prime.app;

public class Helmet {
	private String brand;
	private String color;
	private double price;
	private String shape;
	private String type;

	@Override
	public String toString() {
		return "brand:" + this.brand + " color: " + this.color + " price: " + this.price + " shape : " + this.shape
				+ " type :" + this.type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
