class FireExtinguisher{
String name;
String company;
String types;
int ph;
String brand;
FireExtinguisher(String name,String company,String types,int ph,String brand)
{
System.out.println("Running String,String,String,int,String const of FireExtinguisher");
this.name=name;
this.company=company;
this.types=types;
this.ph=ph;
this.brand=brand;
}
void printInstanceVariable()
{
	System.out.println("Running printInstanceVariable of the const main");
	System.out.println(this.name);
	System.out.println(this.company);
	System.out.println(this.types);
	System.out.println(this.name);
	System.out.println(this.brand);
	
}
}
