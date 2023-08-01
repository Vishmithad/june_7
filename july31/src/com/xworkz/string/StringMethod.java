package com.xworkz.string;

public class StringMethod {
	
		public static void main(String[] args) {

			String example = "java course in xworkz";

			System.out.println(example.charAt(15)); // x

			System.out.println(example.concat(" june")); // java course in xworkz
			System.out.println(example.substring(5)); // java course

			System.out.println(example.substring(5, 7)); // java

			System.out.println(example.indexOf("java")); // 5

			System.out.println(example.indexOf("java", 5)); // 12

			String example2 = "vishamitha@gmail.com";
			String exstr[] = example.split("java");
			for (String exs2 : exstr) {
				System.out.print(exs2); // java course
			}
			System.out.println();

			System.out.println(example.equalsIgnoreCase(example2)); // false

			System.out.println(example.equals(example2)); // false

			String example3 = "todays class is Strings";

			System.out.println(example.compareTo(example2)); // -21

			System.out.println(example.compareToIgnoreCase(example3)); // 5

			String name = "Vishmitha";
			char n[] = name.toCharArray();
			for (int i = 0; i < n.length; i++) {
				System.out.println(n[i]);
			}

			System.out.println(name.toUpperCase()); // VISHMITHA

			System.out.println(name.isEmpty()); // false

			System.out.println(name.length()); // 9

			System.out.println(name.startsWith("V")); // true

			System.out.println(name.replace('h', 'a')); //vishmitha

			System.out.println(example2.replaceAll("@", "-")); // vishmitha@gamil.com

//			System.out.println(name.valueOf(true));
		}

	}

