package com.xworkz.prime.app;

public class DryFruit {
private String name;
private String color;
private double price;
private int calories;
private int magnesium;
private int types;
public DryFruit(String name, String color, double price, int calories, int magnesium, int types) {
	super();
	this.name = name;
	this.color = color;
	this.price = price;
	this.calories = calories;
	this.magnesium = magnesium;
	this.types = types;
}
public DryFruit() {
	super();
}
@Override
public boolean equals(Object obj) {
	if (obj != null) {
	System.out.println("argument is not null,can compare");
	if (obj instanceof DryFruit) {
		DryFruit casted = (DryFruit) obj;
	if (this.name == casted.name && this.color == casted.color && this.price == casted.price
					&& this.calories == casted.calories && this.magnesium == casted.magnesium && this.types==casted.types) {
	System.out.println("both are same");
    return true;
}

else

{
	System.err.println("both are not same");
}
} else

{
	System.err.println("argument is null,cannot compare");
}
}
	return false;
}
@Override
public String toString() {
	return "DryFruit [name=" + name + ", color=" + color + ", price=" + price + ", calories=" + calories
			+ ", magnesium=" + magnesium + ", types=" + types + "]";
}
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public double getPrice() {
	return price;
}
public int getCalories() {
	return calories;
}
public int getMagnesium() {
	return magnesium;
}
public int getTypes() {
	return types;
}
}

