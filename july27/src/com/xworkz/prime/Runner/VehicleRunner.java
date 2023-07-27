package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Vehicle;
public class VehicleRunner {
	public static void main(String[] args) {
	System.out.println("running main VehicleRunner");
	Vehicle vehicle=new Vehicle("ktm","canyon","white",180000,"kan");
	Vehicle vehicle2=new Vehicle("ktm","canyon","white",180000,"kan");
	boolean same=vehicle.equals(vehicle2);
	System.out.println("Vehicle is a same" + same );
}
}





