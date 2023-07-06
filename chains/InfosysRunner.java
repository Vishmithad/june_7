class InfosysRunner{
	public static void main(String[] things)
	{
		System.out.println("running main of InfosysRunner");
		
		Infosys ref=new Infosys();
		System.out.println("founderName"+ref.founderName);
		System.out.println("foufounderWifeName :"+ref.founderWifeName);
		System.out.println("founded"+ref.founded);
		System.out.println("totalEmployees"+ref.totalEmployees);
		
		Infosys ref1=new Infosys();
		System.out.println("founderName"+ref1.founderName);
		System.out.println("foufounderWifeName :"+ref1.founderWifeName);
		System.out.println("founded"+ref1.founded);
		System.out.println("totalEmployees :"+ref1.totalEmployees);
		
		Infosys ref2=new Infosys("Narayanmurty","Sudhamurty");
		System.out.println("founderName :"+ref2.founderName);
		System.out.println("founderWifeName :"+ref2.founderWifeName);
		System.out.println("founded :"+ref2.founded);
		System.out.println("totalEmployees"+ref2.totalEmployees);
		
		Infosys ref3=new Infosys("Narayanmurty","Sudhamurty");
		System.out.println("founderName :"+ref3.founderName);
		System.out.println("foufounderWifeName :"+ref3.founderWifeName);
		System.out.println("founded :"+ref3.founded);
		System.out.println("totalEmployees :"+ref3.totalEmployees);
		
		
	}
}
		
		
		