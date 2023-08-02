package com.xworkz.Runner;
import com.xworkz.implementation.MobilePhone;
import com.xworkz.implementation.Tablet;

public class MobileRunner {
		public static void main(String[] args) {
			MobilePhone myPhone = new MobilePhone();
			myPhone.poweron();
			myPhone.powerOff();
			myPhone.makeCall();

			Tablet myTablet = new Tablet();
			myTablet.poweron();
			myTablet.powerOff();
		}

	}

