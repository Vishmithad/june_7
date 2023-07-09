class Worker{
String name;
String company;
int age;
int height;
int experiance;
Worker(String name,String company,int age,int height,int experiance)
{
System.out.println("Running String,String,int,int,int const of FireExtinguisher");
this.name=name;
this.company=company;
this.age=age;
this.height=height;
this.experiance=experiance;
}
void printInstanceVariable()
{
	System.out.println("Running printInstanceVariable of the const main");
	System.out.println(this.name);
	System.out.println(this.company);
	System.out.println(this.age);
	System.out.println(this.height);
	System.out.println(this.experiance);
	
}
}
