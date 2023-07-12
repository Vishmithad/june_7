package com.Xworkz.july12task;

public class Wire {
	static String color;
	double weight;
	void displayInstance()
	{
		System.out.println(this.weight);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(color);
	return color;
}
}



