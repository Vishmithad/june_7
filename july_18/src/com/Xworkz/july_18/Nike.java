package com.Xworkz.july_18;

public class Nike extends Shoe {
	String ceo;
	String brandAmbassador;
	public Nike(String ceo,String brandAmbassador,double price,ShoeColor color, ShoeSize size) {
		super(price,color,size);
        this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
	}
	void printInfo() {
		System.out.println("ceo:"+this.ceo);
		System.out.println("brandAmbassador:"+this.brandAmbassador);
		System.out.println("price:"+this.price);
		System.out.println("ShoeColor:"+this.color);
		System.out.println("ShoeSize:"+this.size);
		
	}
}
