package com.xworkz.prime.app;

public class Gold {
private String name;
private String type;
private double price;
private int atomicNumber;
public Gold(String name, String type, double price, int atomicNumber) {
	super();
	this.name = name;
	this.type = type;
	this.price = price;
	this.atomicNumber = atomicNumber;
}
public Gold() {
	super();
}
@Override
public boolean equals(Object obj) {
if(obj!=null) {
	System.out.println("argument is not null,can compare");
	if(obj instanceof Gold) 
	{
		Gold casted=(Gold)obj;
	if(this.name==casted.name && this.type==casted.type && this.price==price && this.atomicNumber==casted.atomicNumber) 
	{
    System.out.println("both are same");
	return true;
}

else

{
	System.err.println("both are not same");
}
}
else

{
	System.err.println("argument is null,cannot compare");
}
}
	return false;
}
@Override
public String toString() {
	return "Gold [name=" + name + ", type=" + type + ", price=" + price + ", atomicNumber=" + atomicNumber + "]";
}
public String getName() {
	return name;
}
public String getType() {
	return type;
}
public double getPrice() {
	return price;
}
public int getAtomicNumber() {
	return atomicNumber;
}
}
