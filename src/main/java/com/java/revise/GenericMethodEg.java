package com.java.revise;

public class GenericMethodEg {

	public static < E > void printArray( E[] inputArray ) {
		for(E e: inputArray) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"a","b","c","d"};
		Integer irr[] = {1,2,4,5};
		printArray(arr);
		printArray(irr);
	}
	
}
