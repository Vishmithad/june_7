package com.Xworkz.july12task;

public class SimCard {
	static String types;
	double price;
	void displayInstance()
	{
		System.out.println(this.price);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(types);
	return types;
}
}


