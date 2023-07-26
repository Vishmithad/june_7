package com.xworkz.prime.Runner;
import com.xworkz.prime.app.MLA;
public class MLARunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		MLA MLA=new MLA();
		System.out.println(MLA);//print toString implicit

		Object object2=new MLA();
		System.out.println(object2.toString());//print toString explicit

	}
}


