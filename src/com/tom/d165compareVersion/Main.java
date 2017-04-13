package com.tom.d165compareVersion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * question:Leetcode -165 Compare Version Numbers
		 * author:tom
		 * time:2016-12-22 08:31:53
		 * 题目大意：给定两个版本号比较大小，.作为分隔符，只有数和.
		 */
		String s="11";
		String[] ss=s.split("\\.");
		System.out.println(ss[0]);
		System.out.println(com.tom.d165compareVersion.SelfSolution.compareVersion("1.01", "1.1"));
		
	}

}
