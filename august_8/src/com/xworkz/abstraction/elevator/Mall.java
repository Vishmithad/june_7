package com.xworkz.abstraction.elevator;

public class Mall {

	private Elevator elevator;

	public Mall(Elevator elevator) {
		this.elevator = elevator;
	}

	public void getCarryLaggage() {
		if(elevator!=null) {
			System.out.println("Elevator is not null");
			this.elevator.carryLaggage();
		}
		else {
			System.err.println("Elevator is null, cannot carryLaggage");
		}
	}
}