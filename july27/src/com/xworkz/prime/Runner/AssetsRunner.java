package com.xworkz.prime.Runner;
import com.xworkz.prime.app.Assets;
public class AssetsRunner {
		public static void main(String[] args) {
			System.out.println("running main AssetsRunner");
			Assets assets=new Assets("home","inventory","bangalore");
			Assets assets2=new Assets("land","investment","mysore");
			boolean same=assets.equals(assets2);
			System.out.println("Assets is a same" + same );
		}
		}
