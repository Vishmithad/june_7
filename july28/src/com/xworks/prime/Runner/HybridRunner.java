package com.xworks.prime.Runner;
import com.xworkz.prime.app.Lipstick;
import com.xworkz.prime.app.LakmeBag;
public class HybridRunner {
	
		public static void main(String[] args) {
				System.out.println("Running main in Hybrid Runner");

				LakmeBag lakmeBag = new LakmeBag("lakshmi",150,"white",200,15);
				lakmeBag.printInfo();
				System.out.println("");
				Lipstick lakmeBag1= new Lipstick("lakmecushion",239, "blue",300);
				lakmeBag1.printInfo();
		}

	}

