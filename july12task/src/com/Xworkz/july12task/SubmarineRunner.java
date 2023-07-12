package com.Xworkz.july12task;

public class SubmarineRunner {
	public static void main(String[] args) {
		System.out.println("Running main in SubmarineRunner");
		Submarine ref=new Submarine();
		Submarine.name="russian";
		ref.noOfSubmarine=16;
		ref.displayInstance();
	}
}


