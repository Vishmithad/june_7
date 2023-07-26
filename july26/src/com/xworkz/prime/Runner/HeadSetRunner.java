package com.xworkz.prime.Runner;
import com.xworkz.prime.app.HeadSet;

public class HeadSetRunner {
	public static void main(String[] args) {
		HeadSet headSet=new HeadSet();
		System.out.println(headSet.toString());
		headSet.setName("Bore");
		headSet.setColor("red");
		headSet.setPrice(3000);
		headSet.setBrand("sony");
		headSet.setType(8);
		System.out.println(headSet.toString());
	}
}



