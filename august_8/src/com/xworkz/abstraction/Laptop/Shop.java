package com.xworkz.abstraction.Laptop;

import com.xworkz.abstraction.WashingMachine.washingMachine;

public class Shop {
	private Laptop laptop;

	public Shop(Laptop laptop) {
	this.laptop = laptop;
	}

	public void getdisplay() {
		if(laptop!= null) {
			System.out.println("laptop is not null");
			this.laptop.display();
		}
		else {
			System.err.println("laptop is null, machine cannot rinse");
		}
	}
}



