package com.xworkz.prime.app;

public class University {

private String name;
private String location;

public University(String name, String location) {
	super();
	this.name = name;
	this.location = location;
}




public void printInfo() {
	System.out.println("Name :"+name);
	System.out.println("location :"+location);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}

