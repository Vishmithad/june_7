package com.xworkz.Runner;
import com.xworkz.implementation.BackPack;
import com.xworkz.implementation.HandBag;

public class BagRunner {
		public static void main(String[] args) {
			HandBag purse = new HandBag();
			purse.display();
			purse.closed();
			purse.carry();

			BackPack schoolBag = new BackPack();
			schoolBag.display();
			schoolBag.closed();
		}

	}
