package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Tap;
public class TapRunner {	
			public static void main(String[] args) {
				Tap tap=new Tap();
				System.out.println(tap.toString());
				tap.setName("disk");
				tap.setColor("silver");
				tap.setPrice(1500);
				tap.setBrand("jaquar");
				tap.setType(12);
				System.out.println(tap.toString());
			}
	}

