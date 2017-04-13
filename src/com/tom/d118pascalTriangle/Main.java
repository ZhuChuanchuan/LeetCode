package com.tom.d118pascalTriangle;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * question:Pascal's Triangle
		 * author:tom
		 * time:2016-12-12 09:50:25
		 * 题目大意：求第n行的杨辉三角
		 */
		List<List<Integer>> list=SelfSolution.generate(5);
		for(int i=0;i<list.size();i++){
			List<Integer> ints=list.get(i);
			for(int j=0;j<ints.size();j++){
				System.out.print(ints.get(j)+" ");
			}
			System.out.println();
		}
	}

}
