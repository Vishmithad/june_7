package com.xworkz.abstraction.SmartWatch;

public class Shop {
	private SmartWatch smartWatch;

	public Shop(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smart watch arguement");
	}

	public void getshowTime() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.showTime();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}
}
