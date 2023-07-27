package com.xworkz.prime.app;

public class Assets {
	private String name;
	private String types;
	private String location;
	public Assets(String name, String types, String location) {
		super();
		this.name = name;
		this.types = types;
		this.location = location;
	}
	@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		System.out.println("argument is not null,can compare");
		if(obj instanceof Assets) 
		{
			Assets casted=(Assets)obj;
		if(this.name==casted.name && this.types==casted.types && this.location==casted.location) 
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
		return " name " + name +  " types " + types + " location " + location  ;
	}
	public Assets() {
		super();
	}
	public String getName() {
		return name;
	}
	public String getTypes() {
		return types;
	}
	public String getLocation() {
		return location;
	}
}
