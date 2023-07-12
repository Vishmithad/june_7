package com.Xworkz.july12task;

public class Rope {
	static int diameter;
	double weight;
	void displayInstance()
	{
		System.out.println(this.weight);
		displaystatic();
	}
static int displaystatic() {
	System.out.println(diameter);
	return diameter;
}
}



