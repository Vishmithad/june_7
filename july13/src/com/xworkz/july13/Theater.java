package com.xworkz.july13;

public class Theater {
		String name;
		String ownerName="bharath";
		TheaterTypes type;
		String location;
		Theater(String name)
		{
			this.name=name;
		}
		void TheaterTypes(TheaterTypes type)
		{
			this.type=type;
		}
		void display()
		{
			System.out.println(this.name);
			System.out.println(this.ownerName);
			System.out.println(this.type);
			System.out.println(this.location);
		}
}
