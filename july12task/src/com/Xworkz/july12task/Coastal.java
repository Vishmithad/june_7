package com.Xworkz.july12task;

public class Coastal {
	static String name;
	String types;
	void displayInstance()
	{
		System.out.println(this.types);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(name);
	return name;
}
}



