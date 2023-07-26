package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Helmet;
public class HelmetRunner {
	

		public static void main(String[] args) {
			Helmet helmet=new Helmet();
			System.out.println(helmet.toString());
			helmet.setBrand("HJC");
			helmet.setColor("black");
			helmet.setPrice(500);
			helmet.setShape("roundoval");
			helmet.setType("motorcycle");
			System.out.println(helmet.toString());
		}
	}


