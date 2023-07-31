package com.xworkz.prime.app;

public class Vtu extends University{
	private String clgName;
	private int noOfStudents;
	
	public Vtu(String name,String clgName , String location, int noOfStudents) {
		super(name, location);
		this.clgName = clgName;
		this.noOfStudents = noOfStudents;
	}

	@Override
	
	public void printInfo() {
		super.printInfo();
		System.out.println("clgName :"+clgName);
		System.out.println("noOfStudents :"+noOfStudents);
		
	}	
}

