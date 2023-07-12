package com.Xworkz.july12task;

public class EngineRunner {
	public static void main(String[] args) {
		System.out.println("Running main in EngineRunner");
		Engine ref=new Engine();
		Engine.name="dieselEngine";
		ref.weight=400;
		ref.displayInstance();
	}
	}


