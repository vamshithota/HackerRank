package com.java.practise;

import java.util.HashMap;
import java.util.Map;

public class AnagramsChallenge {

	    static boolean isAnagram(String a, String b) {
	        // Complete the function
	        if( a == null || b == null || a.equals("") || b.equals("") )
	    throw new IllegalArgumentException();

	// initial quick test for non-anagrams
	if ( a.length() != b.length() )
	    return false;

	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        Map<Character,Integer> map = new HashMap<>();
	        int k=0;
	        for(int i=0;i<b.length();i++){
	        	
	            char letter = b.charAt(i);
	            if(!map.containsKey(letter)){
	            	Integer freq = map.get(b.charAt(i));
	            	freq = (freq == null) ? 0:1;
	                map.put(b.charAt(i),freq++);
	            }else{
	                Integer frequncy = map.get(letter);
	                map.put(letter,frequncy++);
	            }
	        }
	        
	        for(int j=0;j<b.length();j++){
	            char letter = b.charAt(j);
	            if(!map.containsKey(letter)){
	                return false;
	            }
	          Integer frequency =  map.get(letter);
	          if(frequency==0)
	          {
	              return false;
	          }else {
	              map.put( letter, --frequency);
	          }
	        }
			return true;
	    }

	  public static void main(String[] args) {
		  String a="managra";
		  String b = "margana";
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }

}
