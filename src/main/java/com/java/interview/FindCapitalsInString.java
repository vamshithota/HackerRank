package com.java.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCapitalsInString {
	public static void main(String[] args) {
	String str = "VamshiKrishnaThota";
		int count =0;
	//Way 1
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i) >=65 && str.charAt(i) <=90) {
			count++;
		}
	}
		System.out.println(count);
		
		//Way2
		int count1=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>= 'A' && str.charAt(i)<='Z') {
				count1++;
			}
		}
		System.out.println(count1);
		
		// Way 3
		int count2=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				count2++;
			}
		}
		System.out.println(count2);
		
		//Way 4
		long count4 = str.chars().filter( c -> c>=65 && c<=90).count();
		System.out.println(count4);
		
		//Way 5
		
		long count5 = str.chars().filter(c-> Character.isUpperCase(c)).count();
		System.out.println(count5);
		
		// Way 6 REGEX'
		int count6=0;
		String regex = "[A-Z]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			count6 += matcher.group(0).length();
		}
		System.out.println(count6);
		
}
	
	
	
}
