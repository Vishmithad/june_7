package com.xworkz.july14;

public class IplTeamRunner {
	public static void main(String[] arg)
	{
		System.out.println("Running main in IplTeamRunner");
		IplTeam iplTeam=new IplTeam("rcb");
		iplTeam.iplTeamType(IplTeamType.projectTeams);
		iplTeam.timings="7";
		iplTeam.printInfo();
	
}
}


