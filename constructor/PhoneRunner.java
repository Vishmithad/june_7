class PhoneRunner{
	public static void main(String[] things)
	{
		System.out.println("running main of PjoneRunner class");
		Phone ref=new Phone();
		System.out.println(ref.brand);
		Phone ref1=new Phone("samsung",30000);
		System.out.println(ref1.brand);
		System.out.println(ref1.price);
		Phone ref2=new Phone();
		System.out.println(ref2.battery);
		Phone ref3=new Phone(30000);
		System.out.println(ref3.price);
		System.out.println(ref3.battery);
		
		
	}
}
		
		