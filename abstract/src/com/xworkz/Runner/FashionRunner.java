package com.xworkz.Runner;
import com.xworkz.implementation.Accessories;
import com.xworkz.implementation.Clothing;

public class FashionRunner {

		public static void main(String[] args) {
			Clothing shirt = new Clothing();
			shirt.display();
			shirt.quality();
			shirt.wear();

			Accessories bag = new Accessories();
			bag.display();
			bag.quality();

		}

	}

