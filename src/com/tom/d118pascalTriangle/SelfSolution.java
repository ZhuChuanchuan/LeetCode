package com.tom.d118pascalTriangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelfSolution {
/*
 * question:Pascal's Triangle
 * author:tom
 * time:2016-12-12 09:50:25
 */
public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
        	List<Integer> listRow=new LinkedList<Integer>();
        	if(i==0){
        		listRow.add(1);
        	}else if(i==1){
        		listRow.add(1);
        		listRow.add(1);
        	}else{
        		listRow.add(1);
        		for(int j=1;j<i;j++){
        			listRow.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));	
        		}
        		listRow.add(1);
        	}
        	list.add(listRow);
        }
        return list;
        
    }
}
