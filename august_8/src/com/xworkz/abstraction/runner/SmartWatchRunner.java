package com.xworkz.abstraction.runner;
import com.xworkz.abstraction.SmartWatch.SmartWatch;
import com.xworkz.abstraction.SmartWatch.appleWatch;
import com.xworkz.abstraction.SmartWatch.Shop;
public class SmartWatchRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Smart watch Runner\n");

		SmartWatch smartWatch = new appleWatch();

		Shop shop = new Shop(smartWatch);
		shop.getshowTime();

	}
}
