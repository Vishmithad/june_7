package com.xworkz.july13;

public class ResortRunner {

	public static void main(String[] args) {
	Resort ref=new Resort("jadeMountain");
	ref.resortTypes(ResortTypes.golf);
	ref.breakFast="cornFlakes";
	ref.display();
	
    Resort ref1=new Resort("pyramid");
    ref1.resortTypes(ResortTypes.beach);
    ref1.breakFast="riceCrispies";
    ref1.display();
		
		
		
	}

}
