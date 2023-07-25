package com.xworkz.prime.Runner;
import com.xworkz.prime.app.PrimeMinister;

public class PrimeMinisterRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		PrimeMinister PrimeMinister=new PrimeMinister();
		System.out.println(PrimeMinister);//print toString implicit

		PrimeMinister PrimeMinister2=new PrimeMinister();
		System.out.println(PrimeMinister2.toString());//print toString explicit

	}
}


