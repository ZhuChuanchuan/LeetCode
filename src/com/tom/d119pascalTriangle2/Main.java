package com.tom.d119pascalTriangle2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * question:leetcode -119. Pascal's Triangle II
		 * author:tom
		 * time:2016-12-12 10:22:30
		 * 题目大意：求杨辉三角第n行的元素
		 */
		
		List<Integer> list=SuperiorSolution.getRow(4);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
	}

}
