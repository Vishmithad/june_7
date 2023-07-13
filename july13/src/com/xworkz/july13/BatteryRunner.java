package com.xworkz.july13;

public class BatteryRunner {

		public static void main(String[] args) {
		Battery ref=new Battery("exide");
		ref.batteryType(BatteryType.lithium);
		ref.price=1000;
		ref.display();
		
	    Battery ref1=new Battery("luminuous");
	    ref1.batteryType(BatteryType.lead);
	    ref1.price=4000;
	    ref1.display();
			
		}

	}



