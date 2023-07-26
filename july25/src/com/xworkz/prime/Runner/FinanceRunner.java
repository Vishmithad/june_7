package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Finance;
public class FinanceRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		Finance Finance=new Finance();
		System.out.println(Finance);//print toString implicit

		Object object2=new Finance();
		System.out.println(object2.toString());//print toString explicit

	}
}


