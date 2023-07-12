package com.Xworkz.july12task;

public class SimCardRunner {
	public static void main(String[] args) {
		System.out.println("Running main in SimCardRunner");
		SimCard ref=new SimCard();
		SimCard.types="microSim";
		ref.price=500;
		ref.displayInstance();
	}
}


