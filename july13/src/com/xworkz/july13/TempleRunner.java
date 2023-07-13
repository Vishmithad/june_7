package com.xworkz.july13;

public class TempleRunner {
	public static void main(String[] args) {
		Temple ref=new Temple("ganesha");
		ref.TempleTypes(TempleTypes.nagara);
		ref.openingTime="9";
		ref.display();
		
	    Temple ref1=new Temple("parvathi");
	    ref1.TempleTypes(TempleTypes.vesara);
	    ref1.openingTime="9";
	    ref1.display();
			
}
}
