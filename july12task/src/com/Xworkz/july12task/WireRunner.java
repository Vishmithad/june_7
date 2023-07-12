package com.Xworkz.july12task;

public class WireRunner {
	public static void main(String[] args) {
		System.out.println("Running main in WireRunner");
		Wire ref=new Wire();
		Wire.color="red";
		ref.weight=0.195;
		ref.displayInstance();
	}
}
