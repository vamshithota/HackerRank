package com.java.practise;

public class JavaStringReverseChallenge {
private static String checkPalindrome(String s) {
	String result="No";
	if(!s.isBlank()) {
		int i = 0;
		int j= s.length()-1;
		while(s.charAt(i) == s.charAt(j) && i++ < j--);
		result = i>j ? "Yes": "No";
	}
	return result;
}

public static void main(String[] args) {
	System.out.println(checkPalindrome("mom"));
}
}
