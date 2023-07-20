package com.Xworkz.july20;

public class BoilerChicken extends Chicken{
boolean Alive;
double weight;
public BoilerChicken(int price,String location,boolean Alive,double weight ) {
	super(price,location);
	this.Alive=Alive;
	this.weight=weight;
	
}
@Override
void printInfo()
{
	super.printInfo();
	System.out.println("it is alive:"+Alive);
	System.out.println("chicken weight is:"+weight);
	

	
}
}
