package com.xworkz.implementation;
import com.xworkz.abstractclass.Vehicle;

public class Car extends Vehicle{
		public final void Horn() { 
			System.out.println("Honk honk!");
		}

		@Override 
		public void stop() {
			System.out.println("Car started.");
		}
	}
