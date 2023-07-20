package com.xworkz.method;

public class Bike {
String color;
double price;
Bike(String color,double price)
{
	this.color=color;
	this.price=price;
	System.out.println("running tha const is class");
	System.out.println(color);
	System.out.println(price);
	
	}

public static void main(String[] args){
	Bike ref1=new Bike("blue",40);
	
}

}
