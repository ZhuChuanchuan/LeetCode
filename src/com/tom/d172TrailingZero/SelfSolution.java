package com.tom.d172TrailingZero;

public class SelfSolution {
/*
 * question:leetcode -172 Factorial Trailing Zeroes
 * author:tom
 * time:2016-12-29 09:29:39
 */
public int trailingZeroes(int n) {
	 int r = 0;
     while (n > 0) {
         n /= 5;
         r += n;
     }
     return r;
    }
}
