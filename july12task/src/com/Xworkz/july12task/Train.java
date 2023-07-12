package com.Xworkz.july12task;

public class Train {
	static String name;
	String color;
	void displayInstance()
	{
		System.out.println(this.color);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(name);
	return name;
}

}
