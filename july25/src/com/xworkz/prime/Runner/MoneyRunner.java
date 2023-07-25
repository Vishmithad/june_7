package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Money;
public class MoneyRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		Money Money=new Money();
		System.out.println(Money);//print toString implicit

		Money Money2=new Money();
		System.out.println(Money2.toString());//print toString explicit

	}
}


