class Kabab{
	String name="shish";
	String hotelName="adithya";
	double price;
	int noofpieces;
	boolean takeAway;
	Kabab()
	{
		System.out.println("running no-arg const of main");
	}
	Kabab(String name,String hotelName)
	{
        System.out.println("running String,String const of main");
        System.out.println("name :"+name);
		System.out.println("price :"+hotelName);
		this.name="shish";
		this.hotelName="adithya";
	}
	Kabab(double price)
	{
	System.out.println("running double const of main");
    this.price=price;
	}
	Kabab(int noofpieces)
	{
	System.out.println("running int const of main");
    this.noofpieces=noofpieces;
	}
	Kabab(boolean takeAway)
	{
	System.out.println("running boolean const of main");
    this.takeAway=takeAway;
	}
	}
				
			
			
	
	