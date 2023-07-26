package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Satellite;

public class SatelliteRunner {
	
		public static void main(String[] args) {
			Satellite satellite=new Satellite();
			System.out.println(satellite.toString());
			satellite.setName("aryaBhata");
			satellite.setColor("blue");
			satellite.setUse("navigation");
			satellite.setShape("box");
			satellite.setType(4);
			System.out.println(satellite.toString());
		}
	}


