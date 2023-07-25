package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Lotus;
public class LotusRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		Lotus Lotus=new Lotus();
		System.out.println(Lotus);//print toString implicit

		Lotus Lotus2=new Lotus();
		System.out.println(Lotus2.toString());//print toString explicit

	}
}



