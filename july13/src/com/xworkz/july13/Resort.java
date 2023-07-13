package com.xworkz.july13;

public class Resort {
String name;
String ownerName="suresh";
ResortTypes type;
String breakFast;
Resort(String name)
{
	this.name=name;
}
void resortTypes(ResortTypes type)
{
	this.type=type;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.ownerName);
	System.out.println(this.type);
	System.out.println(this.breakFast);
}
}
