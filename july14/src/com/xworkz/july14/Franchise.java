package com.xworkz.july14;

public class Franchise {
	String name;
	String type;
	int rank ;
	String industry;
	Franchise()
	{
		System.out.println("Running no-arg in Franchise");
	}
	Franchise(String name,String type,int rank,String industry)
	{
	System.out.println("Running String,String,int,String const of Franchise");
	   this.name=name;
	   this.type=type;
	   this.rank=rank;
	   this.industry=industry;
	}
		   void setage(String type)
		   {
			   this.type=type;
		   }
	   void printInfo()
	   {
		   System.out.println(this.name);
		   System.out.println(this.type);
		   System.out.println(this.rank);
		   System.out.println(this.industry);
	   }
	}

