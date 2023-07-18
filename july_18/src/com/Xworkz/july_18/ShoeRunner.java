package com.Xworkz.july_18;

public class ShoeRunner {
	public static void main(String[] args) {
		System.out.println("Running main in ShoeRunner");
		
		Shoe shoe1 = new Shoe(1300, ShoeColor.WHITE, ShoeSize.FIVE);
		ShoeUtil.check(shoe1);
		
		Shoe shoe2 = new Puma("Casuals","India",3000,ShoeColor.BLACK,ShoeSize.TEN);
		ShoeUtil.check(shoe2);
		
		Shoe shoe3 = new Nike("johnDonahoe","Rory Mcllory",1500,ShoeColor.BLUE,ShoeSize.SIX);
		ShoeUtil.check(shoe3);
		
	}

}
