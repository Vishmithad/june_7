package com.xworks.prime.Runner;
import com.xworkz.prime.app.Shop;

public class SingleLevelRunner {
		public static void main(String[] args) {
			System.out.println("Running main in Single Level Runner\n");
			
			Shop Shop = new Shop("adidas", 1000, "balaji", "bamgalore");
			Shop.printInfo();
		}

	}

