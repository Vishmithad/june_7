package com.Xworkz.july12task;

public class Fabric {
static String name;
int types;
void displayInstance()
{
	System.out.println(this.types);
	displaystatic();
}
static String displaystatic() {
System.out.println(name);
return name;
}
}


