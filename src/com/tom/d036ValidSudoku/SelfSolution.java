package com.tom.d036ValidSudoku;

import java.util.Arrays;

public class SelfSolution {
	/*
	 * question��Valid Sudoku
	 * author:tom
	 * time:2016-12-4 15:06:05
	 */
	public static boolean isValidSudoku(char[][] board) {
        boolean[] visited=new boolean[9];
        
        //�ж���
        for(int i=0;i<9;i++){
        	Arrays.fill(visited, false);
        	for(int j=0;j<9;j++){
        		if(!isValid(visited,board[i][j])){
        			return false;
        		}
        	}
        }
        //�ж���
        for(int i=0;i<9;i++){
        	Arrays.fill(visited, false);
        	for(int j=0;j<9;j++){
        		if(!isValid(visited,board[j][i])){
        			return false;
        		}
        	}
        }
        //�ж�3*3����
        for(int i=0;i<9;i+=3){
        	for(int j=0;j<9;j+=3){
        		Arrays.fill(visited, false);
        		for(int k=0;k<9;k++){
        			if(!isValid(visited,board[i+k/3][j+k%3])){
        				return false;
        			}
        		}
        	}
        }
        return true;
    }

	private static boolean isValid(boolean[] visited, char c) {
		// TODO Auto-generated method stub
		
		if(c=='.'){
			return true;
		}
		int num=c-'0';
		if(num<1||num>9||visited[num-1]){
			return false;
		}
		visited[num-1]=true;
		return true;
	}
}
