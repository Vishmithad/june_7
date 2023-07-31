package com.xworks.prime.Runner;
import com.xworkz.prime.app.Vtu;
import com.xworkz.prime.app.University;
import com.xworkz.prime.app.Columbia;

public class HierarchyRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Hierarchy Runner\n");
		
		University Columbia = new Columbia("malnad", "mce", "Hassan", 40);
		HierarchyRunner.show(Columbia);
		
		System.out.println("            ");
		
		University Vtu = new Vtu("Rajeev", "RIT", "HASSAN", 600);
		HierarchyRunner.show(Vtu);

	}


	public static void show(University university){
		if(university!= null) {
			
			if(university instanceof Columbia) {
				Columbia Columbia = (Columbia)university;
				Columbia.printInfo();
				}
			
			 if(university instanceof Vtu) {
				 Vtu Vtu = (Vtu)university;
				 Vtu.printInfo();
			}
		}
		else {
		System.err.println("Object is null please provide a valid value");
		}
	
	}
}

