package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Mixture;
public class MixtureRunner {
	
		public static void main(String[] args) {
			Mixture mixture=new Mixture();
			System.out.println(mixture.toString());
			mixture.setName("haldiram");
			mixture.setColor("yellow");
			mixture.setPrice(150);
			mixture.setBrand("Mtr");
			mixture.setType(12);
			System.out.println(mixture.toString());
		}
	}


