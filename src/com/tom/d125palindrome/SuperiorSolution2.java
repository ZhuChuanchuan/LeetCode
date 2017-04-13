package com.tom.d125palindrome;

public class SuperiorSolution2 {
	 public boolean isPalindrome(String s) {
	        String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");
	        return ss.equals(new StringBuilder(ss).reverse().toString());
	    }
}
