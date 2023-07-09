class Owner{
String name;
String company;
int height;
int weight;
int age;
Owner(String name,String company,int height,int weight,int age)
{
System.out.println("Running String,String,int,int,int const of FireExtinguisher");
this.name=name;
this.company=company;
this.height=height;
this.weight=weight;
this.age=age;
}
void printInstanceVariable()
{
	System.out.println("Running printInstanceVariable of the const main");
	System.out.println(this.name);
	System.out.println(this.company);
	System.out.println(this.height);
	System.out.println(this.weight);
	System.out.println(this.age);
	
}
}
