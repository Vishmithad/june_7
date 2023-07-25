package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Security;

public class SecurityRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		Security Security=new Security();
		System.out.println(Security);//print toString implicit

		Security Security2=new Security();
		System.out.println(Security2.toString());//print toString explicit

	}
}


