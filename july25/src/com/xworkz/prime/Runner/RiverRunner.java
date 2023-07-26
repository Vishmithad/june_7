package com.xworkz.prime.Runner;
import com.xworkz.prime.app.River;

public class RiverRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		River River=new River();
		System.out.println(River);//print toString implicit

		Object object2=new River();
		System.out.println(object2.toString());//print toString explicit

	}
}


