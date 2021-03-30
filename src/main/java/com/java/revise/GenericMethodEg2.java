package com.java.revise;

import java.util.Scanner;

public class GenericMethodEg2 {
	static Scanner scanner = new Scanner(System.in);
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(x.compareTo(y) > 0) {
			max =y;
		}else if(y.compareTo(max) > 0) {
			max =y;
		}else if(z.compareTo(max) > 0) {
			max =z;
		}
		return max;
	}
	public static void main(String[] args) {
		  Integer a = scanner.nextInt();
		 System.out.printf("Max of %d, %d and %d is %d\n\n", 
		         3, 4, 5, maximum( 3, 4, 5 ));

		      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
		         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

		      System.out.printf("Max of %s, %s and %s is %s\n","pear",
		         "apple", "orange", maximum("pear", "apple", "orange"));
		   }
	}

