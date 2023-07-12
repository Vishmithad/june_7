package com.Xworkz.july12task;

public class Submarine {
	static String name;
	int noOfSubmarine;
	void displayInstance()
	{
		System.out.println(this.noOfSubmarine);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(name);
	return name;
}
}



