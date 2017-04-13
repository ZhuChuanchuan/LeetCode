package com.tom.d125palindrome;

public class SelfSolution {
	/*
	 * 分析：不开辟另外空间，用两个指针收尾比对
	 */
	public static boolean isPalindrome(String s) {
		if (s.trim().isEmpty())
			return true;
		int i = 0, j = s.length() - 1;
		while (i < j) {
			char front, rear;
			if (isValid(s.charAt(i))) {
				front = s.charAt(i);
			} else {
				i++;
				continue;
			}
			if (isValid(s.charAt(j))) {
				rear = s.charAt(j);
			} else {
				j--;
				continue;
			}
			if (Character.toLowerCase(front) != Character.toLowerCase(rear)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isValid(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}
}
