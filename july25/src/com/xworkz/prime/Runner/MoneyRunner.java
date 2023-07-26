package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Money;
public class MoneyRunner {
	public static void main(String[] args) {

		System.out.println("Running in main");

		Money Money=new Money();
		System.out.println(Money);//print toString implicit

		Object object2=new Money();
		System.out.println(object2.toString());//print toString explicit

	}
}


