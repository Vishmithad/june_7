package com.xworkz.july13;

public class Mobile {
		String name;
		String color="white";
		MobileTypes type;
		int price;
		Mobile(String name)
		{
			this.name=name;
		}
		void mobileTypes(MobileTypes type)
		{
			this.type=type;
		}
		void display()
		{
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.type);
			System.out.println(this.price);
		}
		}


