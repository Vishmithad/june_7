package com.Xworkz.july12task;

public class NumberPlate {
	static String color;
	double price;
	void displayInstance()
	{
		System.out.println(this.price);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(color);
	return color;
}
}



