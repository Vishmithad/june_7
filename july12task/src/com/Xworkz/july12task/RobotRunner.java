package com.Xworkz.july12task;

public class RobotRunner {
	public static void main(String[] args) {
		System.out.println("Running main in RobotRunner");
		Robot ref=new Robot();
		Robot.name="gort";
		ref.weight=300;
		ref.displayInstance();
	}

}
