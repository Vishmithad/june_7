package com.Xworkz.july_18;

public class ShoeUtil {
static void check(Shoe shoe) {
	if(shoe!=null) {
		System.out.println("Price:"+shoe.price);
		System.out.println("color:"+shoe.color);
		System.out.println("size:"+shoe.size);
	}
	if(shoe instanceof Puma) {
		Puma puma=(Puma)shoe;
		puma.printInfo();
	}
	if(shoe instanceof Nike) {
		Nike nike=(Nike)shoe;
		nike.printInfo();
	}
}
}
