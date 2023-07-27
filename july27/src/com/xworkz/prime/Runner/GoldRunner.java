package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Gold;

public class GoldRunner {
		public static void main(String[] args) {
			System.out.println("running main GoldRunner");
			Gold gold=new Gold("aerol","yellowGold",50000,79);
			Gold gold2=new Gold("aerol","yellowGold",50000,79);
			boolean equal=gold.equals(gold2);
			System.out.println("Gold is a same" + equal );
		}
		}


