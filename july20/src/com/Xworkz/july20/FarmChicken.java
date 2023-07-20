package com.Xworkz.july20;

public class FarmChicken extends Chicken{
		int noofDays;
		String careTaker;
		public FarmChicken(int price,String location,int noofDays,String careTaker ) {
			super(price,location);
			this.noofDays=noofDays;
			this.careTaker=careTaker;
			
		}
		@Override
		void printInfo()
		{
			super.printInfo();
			System.out.println("the number of days:"+noofDays);
			System.out.println("the taker:"+careTaker);
			

			
		}
		}




