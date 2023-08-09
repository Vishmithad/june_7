package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.elevator.Elevator;
import com.xworkz.abstraction.elevator.MetroElevator;
import com.xworkz.abstraction.elevator.Mall;
public class ElevatorRunner {


	public static void main(String[] args) {
		System.out.println("Running main in Elevator Runner\n");

		Elevator elevator = new MetroElevator();

		Mall mall = new Mall(elevator);
		mall.getCarryLaggage();
	}

}