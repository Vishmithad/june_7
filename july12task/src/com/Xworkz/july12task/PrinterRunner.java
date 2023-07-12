package com.Xworkz.july12task;

public class PrinterRunner {
	public static void main(String[] args) {
		System.out.println("Running main in WireRunner");
		Printer ref=new Printer();
		Printer.name="laserPrinter";
		ref.price=30000;
		ref.displayInstance();
	}
}


