package com.xworkz.prime.app;

public class Grocery {
private String shopName;
private String types;
public Grocery(String shopName, String types) {
	super();
	this.shopName = shopName;
	this.types = types;
}
@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		System.out.println("argument is not null,can compare");
		if(obj instanceof Grocery) 
		{
		Grocery casted=(Grocery)obj;
		if(this.shopName==casted.shopName && this.types==casted.types) 
		{
	    System.out.println("both are same");
		return true;
	}
	
else

	{
		System.err.println("both are not same");
	}
}
	else

	{
		System.err.println("argument is null,cannot compare");
	}
}
		return false;
}
	
@Override
public String toString() {
	return " shopName " + shopName + " types " + types ;
}
public String getShopName() {
	return shopName;
}

public String getTypes() {
	return types;
}

}
