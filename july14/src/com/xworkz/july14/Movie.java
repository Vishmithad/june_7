package com.xworkz.july14;

public class Movie {
String name;
String language="kannada";
MovieType type;
String timings;
Director director=new Director("raviBsrur",30,5.7,55);
Movie(String name)
{
	System.out.println("running String arg with movie");
	this.name=name;
}
void movieType(MovieType type)
{
	this.type=type;
}
void printInfo()
{
System.out.println(this.name);
System.out.println(this.language);
System.out.println(this.type);
System.out.println(this.timings);
this.director.printInfo();
}
}
