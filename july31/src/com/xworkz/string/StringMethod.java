package com.xworkz.string;

public class StringMethod {
	
		public static void main(String[] args) {

			String course = "java course in xworkz";

			System.out.println(course.charAt(15)); 

			System.out.println(course.concat(" june")); 
			System.out.println(course.substring(5)); 

			System.out.println(course.substring(5, 7)); 
			System.out.println(course.indexOf("java")); 

			System.out.println(course.indexOf("java", 5));

			String course2 = "vishamitha@gmail.com";
			String costr[] = course.split("java");
			for (String cos2 : costr) {
				System.out.print(cos2); 
			}
			System.out.println();

			System.out.println(course.equalsIgnoreCase(course2));

			System.out.println(course.equals(course2)); 

			String course3 = "todays class is Strings";

			System.out.println(course.compareTo(course2)); 

			System.out.println(course.compareToIgnoreCase(course3)); 

			String name = "Vishmitha";
			char n[] = name.toCharArray();
			for (int i = 0; i < n.length; i++) {
				System.out.println(n[i]);
			}

			System.out.println(name.toUpperCase()); 
			System.out.println(name.isEmpty()); 
			System.out.println(name.length()); 

			System.out.println(name.startsWith("V")); 
			System.out.println(name.replace('h', 'a')); 

			System.out.println(course2.replaceAll("@", "-")); 

     		System.out.println(name.valueOf(true));
		}

	}

