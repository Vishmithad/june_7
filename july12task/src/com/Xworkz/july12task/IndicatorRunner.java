package com.Xworkz.july12task;

public class IndicatorRunner {
	public static void main(String[] args) {
		System.out.println("Running main in IndicatorRunner");
		Indicator ref=new Indicator();
		Indicator.color="red";
		ref.price=3000;
		ref.displayInstance();
	}
}



