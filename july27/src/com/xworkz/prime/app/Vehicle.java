package com.xworkz.prime.app;

public class Vehicle {
	private String name;
	private String brand;
	private String color;
	private double price;
	private String inventorName;

	public Vehicle(String name, String brand, String color, double price, String inventorName) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.inventorName = inventorName;
	}

	public Vehicle() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
		System.out.println("argument is not null,can compare");
		if (obj instanceof Vehicle) {
    	Vehicle casted = (Vehicle) obj;
		if (this.name == casted.name && this.brand == casted.brand && this.color == casted.color
						&& this.price == casted.price && this.inventorName == casted.inventorName) {
		System.out.println("both are same");
	    return true;
	}

	else

	{
		System.err.println("both are not same");
	}
	} else

	{
		System.err.println("argument is null,cannot compare");
	}
	}
		return false;
	}

	@Override
	public String toString() {
		return " name " + name + " brand " + brand + " color " + color + " price " + price
				+ " inventorName " + inventorName ;
	}
public String getName() {
	return name;
}
public String getBrand() {
	return brand;
}
public String getColor() {
	return color;
}
public double getPrice() {
	return price;
}
public String getInventorName() {
	return inventorName;
}
}


