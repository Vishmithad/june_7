package com.Xworkz.july12task;

public class ContactLens {
	static String brand;
	double price;
	void displayInstance()
	{
		System.out.println(this.price);
		displaystatic();
	}
static String displaystatic() {
	System.out.println(brand);
	return brand;
}


}
