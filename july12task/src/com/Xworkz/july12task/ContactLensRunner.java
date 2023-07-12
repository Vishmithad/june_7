package com.Xworkz.july12task;

public class ContactLensRunner {
	public static void main(String[] args) {
		System.out.println("Running main in ContactLensRunner");
		ContactLens ref=new ContactLens();
		ContactLens.brand="airOtixAqua";
		ref.price=1000;
		ref.displayInstance();
	}
	

}
