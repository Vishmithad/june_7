package com.xworkz.july14;

public class Hotel {
	String name;
	HotelType type;
	String openingTime;
	String closingTime;
	Owner Owner=new Owner("ravi",35,6.1,67);
	Hotel(String name)
	{
		System.out.println("running String arg with hotel");
		this.name=name;
	}
	void hotelType(HotelType type)
	{
		this.type=type;
	}
	void printInfo()
	{
	System.out.println(this.name);
	System.out.println(this.type);
	System.out.println(this.openingTime);
	System.out.println(this.closingTime);
	this.Owner.printInfo();
	}
	}


