package com.xworkz.july13;

public class MobileRunner {
	public static void main(String[] args) {
		Mobile ref=new Mobile("samsung");
		ref.mobileTypes(MobileTypes.basic);
		ref.price=35000;
		ref.display();
		
	    Mobile ref1=new Mobile("apple");
	    ref1.mobileTypes(MobileTypes.feature);
	    ref1.price=40000;
	    ref1.display();
			
}
}