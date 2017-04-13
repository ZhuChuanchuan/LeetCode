package com.tom.d067addBinary;

public class SuperiorSolution {

	public static String addBinary(String a, String b) {
		a = new StringBuilder(a).reverse().toString();
		b = new StringBuilder(b).reverse().toString();
		int maxLen = Math.max(a.length(), b.length());
		StringBuilder res = new StringBuilder(maxLen);
		int ia, ib, carry = 0;
		for (int i = 0; i <= maxLen; i++) {
			ia = (i < a.length() ? Integer.parseInt(a.charAt(i) + "") : 0);
			ib = (i < b.length() ? Integer.parseInt(b.charAt(i) + "") : 0);
			int sum = ia + ib + carry;
			carry = sum >= 2 ? 1 : 0;
			if (i != maxLen || sum != 0) res.append(sum % 2);
		}
		return res.reverse().toString();
	}

}
