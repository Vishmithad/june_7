package com.Xworkz.july12task;

public class TV {
	static String name;
	double price;
	void displayInstance()
	{
		System.out.println(this.price);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(name);
	return name;
}



}
