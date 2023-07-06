class Money{
	String country="india";
	String currency="rupees";
	String denomination;
	int types;
	Money()
	{
		System.out.println("running no-arg const of main");
	}
	Money(String country,String currency)
	{
        System.out.println("running String,String const main");
        System.out.println("country :"+country);
		System.out.println("currency :"+currency);
		this.country="india";
		this.currency="rupees";
	}
	Money(String denomination)
	{
	System.out.println("running int const of main");
    this.denomination=denomination;
	}
	Money(int types)
	{
	System.out.println("running double const of main");
    this.types=types;
	}
		Money(String country,String currency,String denomination)
		{
			this(country,currency);
		    this.denomination=denomination;
			System.out.println("running String,String,String const main");
		}
	}
				
			
			
	
	