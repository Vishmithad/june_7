package com.Xworkz.july12task;

public class TVRunner {
	public static void main(String[] args) {
		System.out.println("Running main in TVRunner");
		TV ref=new TV();
		TV.name="samsung";
		ref.price=50000;
		ref.displayInstance();
	}
}

