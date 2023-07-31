package com.xworks.prime.Runner;
import com.xworkz.prime.app.Bag;
public class BagRunner {


		public static void main(String[] args) {
			System.out.println("Running main in BagRunner");
			
			Bag bag1 = new Bag();
			System.out.println(bag1);
			System.out.println();
			
			Bag bag2 = new Bag("lino", "Black", "tote",200,true);
			System.out.println(bag2);
			System.out.println("");
			
			Bag bag3 = new Bag("zouk", "blue", "backpack", 1500, true);
			System.out.println(bag3);
		}

	}

