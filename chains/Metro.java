class Metro{
	String line="green";
	int distance=66;
	String start;
	String destination;
	int capacity;
	Metro()
	{
		System.out.println("running no-arg const of main");
	}
	Metro(String line,int distance)
	{
        System.out.println("running String,int const main");
        System.out.println("line :"+line);
		System.out.println("distance :"+distance);
		this.line="green";
		this.distance=66;
	}
	Metro(String start)
	{
	System.out.println("running String const of main");
    this.start=start;
	
	}
	Metro(int capacity)
	{
	System.out.println("running int const of main");
    this.capacity=capacity;
	}
		Metro(String line,int distance,String start)
		{
			this(line,distance);
			this.destination=destination;
			this.start=start;
		    this.capacity=capacity;
			System.out.println("running String,int,String const main");
		}
	}
				
			
			
	
	