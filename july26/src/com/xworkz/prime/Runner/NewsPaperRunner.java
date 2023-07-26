package com.xworkz.prime.Runner;
import com.xworkz.prime.app.NewsPaper;
public class NewsPaperRunner {
	public static void main(String[] args) {
		NewsPaper newsPaper=new NewsPaper();
		System.out.println(newsPaper.toString());
		newsPaper.setName("prajavani");
		newsPaper.setNoOfPages(6);
		newsPaper.setPrice(5);
		newsPaper.setBrand("navabharat");
		newsPaper.setType("kannada");
		System.out.println(newsPaper.toString());
	}
}
