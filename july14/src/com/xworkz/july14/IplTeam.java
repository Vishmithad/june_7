package com.xworkz.july14;

public class IplTeam {
	String teamName;
	String playername="virat";
	IplTeamType type;
	String timings;
	Franchise franchise=new Franchise("wendys","4",5,"fastFood");
	IplTeam(String teamName)
	{
		System.out.println("running String arg with IplTeam");
		this.teamName=teamName;
	}
	void iplTeamType(IplTeamType type)
	{
		this.type=type;
	}
	void printInfo()
	{
	System.out.println(this.teamName);
	System.out.println(this.playername);
	System.out.println(this.type);
	System.out.println(this.timings);
	this.franchise.printInfo();
	}
	}


