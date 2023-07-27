package com.xworkz.prime.Runner;

import com.xworkz.prime.app.Sliper;

public class SliperRunner {
	public static void main(String[] args) {
		System.out.println("running main SliperRunner");
		Sliper sliper=new Sliper("casual","bata","black",7,1000,20,"crocs");
		Sliper sliper2=new Sliper("flipflop","puma","grey",7,1000,20,"crocs");
		boolean same=sliper.equals(sliper2);
		System.out.println("sliper is a same" + same );
	}
	}