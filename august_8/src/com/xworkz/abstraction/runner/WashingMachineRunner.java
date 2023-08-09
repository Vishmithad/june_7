package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.WashingMachine.washingMachine;
import com.xworkz.abstraction.WashingMachine.Bosch;
import com.xworkz.abstraction.WashingMachine.Shop;
public class WashingMachineRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Washing machine runner\n");

		Bosch machine = new Bosch();

		Shop shop = new Shop(machine);
		shop.getdry();

	}

}

