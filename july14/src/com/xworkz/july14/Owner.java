package com.xworkz.july14;

public class Owner {
	String ownerName;
	int age;
	double height;
	int weight;
	Owner()
	{
		System.out.println("Running no-arg in Owner");
	}
	Owner(String ownerName,int age,double height,int weight)
	{
	System.out.println("Running String,int,double,int const of Owner");
	   this.ownerName=ownerName;
	   this.age=age;
	   this.height=height;
	   this.weight=weight;
	}
		   void setage(int age)
		   {
			   this.age=age;
		   }
	   void printInfo()
	   {
		   System.out.println(this.ownerName);
		   System.out.println(this.age);
		   System.out.println(this.height);
		   System.out.println(this.weight);
	   }
	}


