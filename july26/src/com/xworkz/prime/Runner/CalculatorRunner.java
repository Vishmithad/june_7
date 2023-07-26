package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Calculator;

public class CalculatorRunner {
	
	

		public static void main(String[] args) {
			Calculator calculator=new Calculator();
			System.out.println(calculator.toString());
			calculator.setName("casio");
			calculator.setColor("black");
			calculator.setPrice(1250);
			calculator.setShape("square");
			calculator.setType(20);
			System.out.println(calculator.toString());
		}
	}


