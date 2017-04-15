package com.tom.d005LongestPaliSubs;

public class SuperioreSolution {
	public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return null;
        int start = 0;
        int end = 0;
        int len = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j || (s.charAt(i) == s.charAt(j) && j - i < 2) //1个字符回文||2个回文字符||3个以上
                        || (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (j - i + 1 > len) {
                        len = j - i;
                        start = i;
                        end = j + 1;
                    }
                }

            }
        }

        return s.substring(start, end);
    }
}
