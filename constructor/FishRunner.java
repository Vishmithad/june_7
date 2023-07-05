class FishRunner{
	public static void main(String[] things)
	{
		System.out.println("running main of FishRunner class");
		Fish ref=new Fish();
		System.out.println(ref.name);
		Fish ref1=new Fish("Goldfish","salmon");
		System.out.println(ref1.name);
		System.out.println(ref1.type);
		Fish ref2=new Fish();
		System.out.println(ref2.cost);
		Fish ref3=new Fish();
		System.out.println(ref3.localname);
		Fish ref4=new Fish("Goldfish");
		System.out.println(ref4.name);
		System.out.println(ref4.cost);
	}
}
		
		
		
		