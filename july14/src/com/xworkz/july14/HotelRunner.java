package com.xworkz.july14;

public class HotelRunner {
		public static void main(String[] arg)
		{
			System.out.println("Running main in HotelRunner");
			Hotel hotel=new Hotel("santhosh");
			hotel.hotelType(HotelType.nonVegHotel);
			hotel.openingTime="8";
			hotel.printInfo();
		
	}
}
