package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Ladoo;
import com.xworkz.prime.app.President;

public class PresidentRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		President President=new President();
		System.out.println(President);//print toString implicit

		President President2=new President();
		System.out.println(President2.toString());//print toString explicit

	}
}


