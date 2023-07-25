package com.xworkz.prime.Runner;
import com.xworkz.prime.app.MLA;
public class MLARunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		MLA MLA=new MLA();
		System.out.println(MLA);//print toString implicit

		MLA MLA2=new MLA();
		System.out.println(MLA.toString());//print toString explicit

	}
}


