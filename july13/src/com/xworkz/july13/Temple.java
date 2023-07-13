package com.xworkz.july13;

public class Temple {
		String name;
		String location="belur";
		TempleTypes type;
		String openingTime;
		Temple(String name)
		{
			this.name=name;
		}
		void TempleTypes(TempleTypes type)
		{
			this.type=type;
		}
		void display()
		{
			System.out.println(this.name);
			System.out.println(this.location);
			System.out.println(this.type);
			System.out.println(this.openingTime);
		}
		}


