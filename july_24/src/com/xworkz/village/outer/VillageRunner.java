package com.xworkz.village.outer;
import com.xworkz.village.Inner.OldVillage;
public class VillageRunner {

	public static void main(String[] args) {
		OldVillage oldVillage = new OldVillage();
		oldVillage.enter();
		oldVillage.exit();
		
		NewVillage newVillage = new NewVillage();
		newVillage.enter();
		newVillage.exit();	
	}
}
