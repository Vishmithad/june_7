class MoneyRunner{
	public static void main(String[] things)
	{
		System.out.println("running main of MoneyRunner");
		
		Money ref=new Money();
		System.out.println("country"+ref.country);
		System.out.println("currency :"+ref.currency);
		System.out.println("denomination"+ref.denomination);
		System.out.println("types"+ref.types);
		
		Money ref1=new Money();
		System.out.println("country"+ref1.country);
		System.out.println("currency :"+ref1.currency);
		System.out.println("denomination"+ref1.denomination);
		System.out.println("types :"+ref1.types);
		
		Money ref2=new Money("country","currency");
		System.out.println("country :"+ref2.country);
		System.out.println("currency :"+ref2.currency);
		System.out.println("denomination :"+ref2.denomination);
		System.out.println("types"+ref2.types);
		
		Money ref3=new Money("country","currency");
		System.out.println("country :"+ref3.country);
		System.out.println("currency :"+ref3.currency);
		System.out.println("denomination :"+ref3.denomination);
		System.out.println("types :"+ref3.types);
		
		
	}
}
		
		
		