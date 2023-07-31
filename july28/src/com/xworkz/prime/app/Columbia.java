package com.xworkz.prime.app;

public class Columbia extends University {
	private String instituteName;
	private int noOflecture;
	
	public Columbia(String name,String instituteName , String location, int noOflecture) {
		super(name, location);
		this.instituteName = instituteName;
		this.noOflecture = noOflecture;
	}

	@Override
	
	public void printInfo() {
		super.printInfo();
		System.out.println("instituteName :"+instituteName);
		System.out.println("noOflecture :"+noOflecture);
		
	}	
}


