package com.xworkz.abstraction.WashingMachine;

public class Shop {
	private washingMachine machine;

	public Shop(washingMachine machine) {
	this.machine = machine;
	}

	public void getdry() {
		if(machine!= null) {
			System.out.println("Machine is not null");
			this.machine.dry();
		}
		else {
			System.err.println("machine is null, machine cannot rinse");
		}
	}
}

