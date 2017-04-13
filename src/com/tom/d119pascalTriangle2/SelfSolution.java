package com.tom.d119pascalTriangle2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelfSolution {
/*
 * question:leetcode -119. Pascal's Triangle II
 * author:tom
 * time:2016-12-12 10:22:30
 */
public List<Integer> getRow(int rowIndex) {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	for (int i = 0; i <=rowIndex; i++) {
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
	return list.get(rowIndex);
    }
}
