package com.xworks.prime.Runner;
import com.xworkz.prime.app.Lizards;
public class MultiLevelRunner {
	
	
		public static void main(String[] args) {
			
			System.out.println("Running main in Multi Level Runner\n");
			
			Lizards lizards = new Lizards("turtles ", "animalia", 12, "black");
					lizards.printInfo();
			

		}

	}
