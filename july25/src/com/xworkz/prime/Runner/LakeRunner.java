package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Lake;
public class LakeRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		Lake Lake=new Lake();
		System.out.println(Lake);//print toString implicit

		Lake Lake2=new Lake();
		System.out.println(Lake2.toString());//print toString explicit

	}
}


