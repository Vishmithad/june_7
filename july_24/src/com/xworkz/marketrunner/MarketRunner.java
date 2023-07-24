package com.xworkz.marketrunner;
import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;
public class MarketRunner {

	public static void main(String[] args) {
		SuperMarket sMarket = new SuperMarket();
		sMarket.sell(); 
		OnlineMarket online = new OnlineMarket();
		online.buy();
	}

}
