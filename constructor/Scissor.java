class Scissor{
	String brand="Fiskars";
	String color="red";
	String type;
	String usage;
	char size=4;
	String material;
	double price;
	Scissor()
	{
		System.out.println("running no-arg const of main");
	}
	Scissor(String brand,String color)
	{
        System.out.println("running String,String const of main");
        System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		this.brand="Fiskars";
		this.color="red";
	}
	Scissor(String type)
	{
	System.out.println("running String const of main");
    this.type=type;
	}
	Scissor(String usage,char size)
	{
	System.out.println("running String,char const of main");
	System.out.println("size :"+size);
    this.usage=usage;
	this.size=4;
	}
	Scissor(double price,String type)
	{
	System.out.println("running double,String const of main");
    this.price=price;
	this.type=type;
	}
	Scissor(String material,double price)
	{
	System.out.println("running String,double const of main");
    this.material=material;
	this.price=price;
	}
	Scissor(String brand,String color,double price)
		{
			System.out.println("running String,String,double const main");
			System.out.println("brand :"+brand);
			System.out.println("color :"+color);
			System.out.println("price :"+price);
			this.brand="Fiskars";
			this.color="red";
		    this.price=price;
		}
}		
			
			
	
	