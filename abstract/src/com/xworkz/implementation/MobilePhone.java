package com.xworkz.implementation;
import com.xworkz.abstractclass.device;
public class MobilePhone extends device {

	
		public final void makeCall() {
			System.out.println("Making a call...");
		}

		@Override
		public void poweron() {
			System.out.println("Mobile phone powered on.");
		}
	}

