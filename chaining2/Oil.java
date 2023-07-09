class Oil{
String name;
String company;
int types;
double price;
String color;
Oil(String name,String company,int types,double price,String color)
{
System.out.println("Running String,String,int,double,String const of FireExtinguisher");
this.name=name;
this.company=company;
this.types=types;
this.price=price;
this.color=color;
}
void printInstanceVariable()
{
	System.out.println("Running printInstanceVariable of the const main");
	System.out.println(this.name);
	System.out.println(this.company);
	System.out.println(this.types);
	System.out.println(this.price);
	System.out.println(this.color);
	
}
}
