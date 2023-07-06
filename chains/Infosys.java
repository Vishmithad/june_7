class Infosys{
	String founderName="Narayanmurty";
	String founderWifeName="Sudhamurty";
	int founded;
	double totalEmployees;
	Infosys()
	{
		System.out.println("running no-arg const of main");
	}
	Infosys(String founderName,String founderWifeName)
	{
        System.out.println("running String,String const main");
        System.out.println("founderName :"+founderName);
		System.out.println("founderWifeName :"+founderWifeName);
		this.founderName="narayanmurty";
		this.founderWifeName="Sudhamurty";
	}
	Infosys(int founded)
	{
	System.out.println("running int const of main");
    this.founded=founded;
	}
	Infosys(double totalEmployees)
	{
	System.out.println("running double const of main");
    this.totalEmployees=totalEmployees;
	}
		Infosys(String founderName,String founderWifeName,int founded)
		{
			this(founderName,founderWifeName);
		    this.founded=founded;
			System.out.println("running String,String,int const main");
		}
	}
				
			
			
	
	