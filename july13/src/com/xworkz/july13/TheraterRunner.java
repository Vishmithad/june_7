package com.xworkz.july13;

public class TheraterRunner {
	public static void main(String[] args) {
		Theater ref=new Theater("bolshoi");
		ref.TheaterTypes(TheaterTypes.imax);
		ref.location="bangalore";
		ref.display();
		
	    Theater ref1=new Theater("national");
	    ref1.TheaterTypes(TheaterTypes.amc);
	    ref1.location="hassan";
	    ref1.display();
	}			
}
