package com.Xworkz.july20;

public class ChickenRunner{
public static void main(String[] args) {
Chicken chicken=new Chicken(407,"chanpatna");
chicken.printInfo();

System.out.println("invoking the ChickenRunner");

Chicken farmChicken=new FarmChicken(350,"mandya chicken center",20,"santhosh");
farmChicken.printInfo();

System.out.println("invoking the method ");

Chicken boilerChicken=new BoilerChicken(250,"chickenFarm",true,2.5);
boilerChicken.printInfo();
}
}
