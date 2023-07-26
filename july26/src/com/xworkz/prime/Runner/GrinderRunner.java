package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Grinder;

public class GrinderRunner {

		public static void main(String[] args) {
			Grinder grinder=new Grinder();
			System.out.println(grinder.toString());
			grinder.setName("crusher");
			grinder.setColor("yellow");
			grinder.setPrice(5000);
			grinder.setShape("cup");
			grinder.setType(12);
			System.out.println(grinder.toString());
		}
	}


