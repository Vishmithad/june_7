package com.Xworkz.july12task;

public class Cylinder {
	static String name;
	int weight;
	void displayInstance()
	{
		System.out.println(this.weight);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(name);
	return name;
}
}
