package com.java.practise;

public class SubstringComparisonsChallenge {
private static String smallestBiggestSubstring(String s, int k) {
	 String sequence = s.substring(0, k);
	    String smallest = sequence;
	    String largest = sequence;
	  for(int i = 1; i <= (s.length() - k); i++){
	        sequence = s.substring(i, (i + k));

	        if(sequence.compareTo(smallest) < 0){
	            smallest = sequence;
	        }
	        if(sequence.compareTo(largest) > 0){
	            largest = sequence;
	        }            
	    }          
	  return smallest + "\s" + largest;
}

	public static void main(String[] args) {
		//Java Substring Comparisons
		System.out.println(smallestBiggestSubstring("welcometojava",3));
	}
}
