package com.java.practise;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BigDecimalChallenge {

	public static void main(String[] args) {
		// sort below array and print number as is
		String ar[] = {"20","1","234","12","0.1","-0.1",".1","345"};
		/*
		 * Arrays.sort(ar, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { if(o1== null || o2 ==
		 * null) { return 0; } BigDecimal bigDecimal = new BigDecimal(o1); BigDecimal
		 * bigDecimal2 = new BigDecimal(o2);
		 * 
		 * return bigDecimal2.compareTo(bigDecimal); }
		 * 
		 * });
		 */		// using java 8
	//	Arrays.sort(ar, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
		// another way
		
		Arrays.sort(ar, (ar1, ar2) -> new BigDecimal(ar2).compareTo(new BigDecimal(ar1)));
		for(String s: ar) {
			System.out.println(s);
		}
	}
}
