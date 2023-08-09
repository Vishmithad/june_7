package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.Laptop.Laptop;
import com.xworkz.abstraction.Laptop.HpLaptop;
import com.xworkz.abstraction.Laptop.Shop;
public class LaptopRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Laptop Runner\n");

		Laptop laptop =  new HpLaptop();	

		Shop shop =  new Shop(laptop);
		shop.getdisplay();
	}
}
