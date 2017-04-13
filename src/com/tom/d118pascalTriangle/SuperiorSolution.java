package com.tom.d118pascalTriangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SuperiorSolution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> listRow = new LinkedList<Integer>();
				for (int j = 0; j <=i; j++) {
					if(j==0||j==i){
						listRow.add(1);
					}else{
						listRow.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));	
					}
				}
			list.add(listRow);
		}
		return list;
	}
}
