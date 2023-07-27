package com.xworkz.prime.app;

public class Sliper {
	private String type;
	private String brand;
	private String color;
	private int size;
	private double price;
	private int quality;
	private String name;

	public Sliper(String type, String brand, String color, int size, double price, int quality,String name) {
		super();
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
		this.quality = quality;
		this.name=name;
		System.out.println("invoking String,String,String,int,double is a cosnt of sliper");
	}

	public Sliper() {
		System.out.println("invoking no-arg const");
	}

@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		System.out.println("Argument is not null,can compare");
		if(obj instanceof Sliper) {
		Sliper casted=(Sliper)obj;
		if(this.type==casted.type && this.brand==casted.brand && this.color==casted.color && this.size==casted.size && this.price==casted.price && this.quality==casted.quality)
	    {
			System.out.println("both are same");
		return true;
	}

else

	{
		System.err.println("both are not same");
	}
}
	else

	{
		System.err.println("Argument is null,cannot compare");
	}
	}
		return false;
	}

	@Override
	public String toString() {
		return " type " + type + " brand " + brand + " color " + color + " size " + size + " price " + price
				+ " quality " + quality + " name " + name ;
	}

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	
	}

	public double getPrice() {
		return price;
	}

	public int getQuality() {
		return quality;
	}
public String getName() {
	return name;
}
	
}
