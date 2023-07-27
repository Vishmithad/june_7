package com.xworkz.prime.Runner;
import com.xworkz.prime.app.DryFruit;
public class DryFruitRunner {

		public static void main(String[] args) {
		System.out.println("running main DryFruitRunner");
		DryFruit dryFruit=new DryFruit("dates","brown",150,3,20,30);
		DryFruit dryFruit2=new DryFruit("dates","brown",150,3,20,30);
		boolean same=dryFruit.equals(dryFruit2);
		System.out.println("DryFruit is a same" + same );
	}
	}
