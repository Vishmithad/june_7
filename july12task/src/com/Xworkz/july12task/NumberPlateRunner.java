package com.Xworkz.july12task;

public class NumberPlateRunner {
	public static void main(String[] args) {
		System.out.println("Running main in NumberPlateRunner");
		NumberPlate ref=new NumberPlate();
		NumberPlate.color="white";
		ref.price=500;
		ref.displayInstance();
	}
}



