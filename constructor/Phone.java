class Phone{
	String brand="samsung";
	double price=30000;
	double battery;

	Phone()
	{
		System.out.println("running no-arg const of main");
	}
	Phone(String brand,double price)
	{
        System.out.println("running String,double const main");
        System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		this.brand="samsung";
		this.price=30000;
	}
	Phone(double battery)
	{
	System.out.println("running double const of main");
    this.battery=battery;
	}
		Phone(double price,double battery)
		{
			System.out.println("running double,double const main");
			System.out.println("price :"+price);
			this.price=30000;
		    this.battery=battery;
		}
	}
				