package com.xworkz.prime.Runner;

import com.xworkz.prime.app.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		Dosa dosa=new Dosa();
		System.out.println(dosa.toString());
		dosa.setName("ravedosa");
		dosa.setColor("white");
		dosa.setPrice(50);
		dosa.setShape("round");
		dosa.setType(120);
		System.out.println(dosa.toString());
	}
}
