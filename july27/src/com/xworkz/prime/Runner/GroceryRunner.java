package com.xworkz.prime.Runner;

import com.xworkz.prime.app.Grocery;

public class GroceryRunner {
	public static void main(String[] args) {
		System.out.println("running main GroceryRunner");
		Grocery grocery=new Grocery("leafGreen","superCenters");
		Grocery grocery2=new Grocery("leafGreen","superCenters");
		boolean same=grocery.equals(grocery2);
		System.out.println("Grocery is a same" + same );
	}
	}
