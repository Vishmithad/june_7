package com.xworkz.prime.app;

public class Satellite {
	private String name;
	private String color;
	private String use;
	private String shape;
	private int type;
	@Override
	public String toString() {
		return "name:" + this.name + " color: " + this.color + " use: " + this.use +  " shape : "+this.shape + " type :"+this.type;
	} 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getUse() {
	return use;
}
public void setUse(String use) {
	this.use = use;
}

public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
}



