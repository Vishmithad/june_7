package com.xworkz.july14;

public class MovieRunner {
public static void main(String[] arg)
{
	System.out.println("Running main in MovieRunner");
	Movie movie=new Movie("galipata");
	movie.movieType(MovieType.comedy);
	movie.timings="3";
	movie.printInfo();
}
}
