class Fish{
	String name="goldfish";
	String type="salmon";
	double cost;
	String localname;
	Fish()
	{
		System.out.println("running no-arg const of main");
	}
	Fish(String name,String type)
	{
        System.out.println("running String,String const main");
        System.out.println("name :"+name);
		System.out.println("type :"+type);
		this.name="goldfish";
		this.type="salmon";
	}
	Fish(double cost)
	{
	System.out.println("running double const of main");
    this.cost=cost;
	}
	Fish(String localname)
	{
	System.out.println("running String const of main");
    this.localname=localname;
	}
		Fish(String name,double cost)
		{
			System.out.println("running String,double const main");
			System.out.println("name :"+name);
			this.name="goldfish";
		    this.cost=cost;
		}
	}
				
			
			
	
	