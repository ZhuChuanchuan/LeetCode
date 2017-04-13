package com.tom.d119pascalTriangle2;

import java.util.ArrayList;
import java.util.List;

public class SuperiorSolution {
	 public static List<Integer> getRow(int rowIndex) {
			List<Integer> list = new ArrayList<Integer>();
			if (rowIndex < 0)
				return list;

			for (int i = 0; i <= rowIndex; i++) {
				list.add(0, 1);
//				System.out.println(list.size()+"*");
				for (int j = 1; j < list.size() - 1; j++) {
					list.set(j, list.get(j) + list.get(j + 1));
				}
			}
			
			//Êä³ö
//			for(int k=0;k<list.size();k++)
//				System.out.print(list.get(k)+" ");
			return list;
		}
}
