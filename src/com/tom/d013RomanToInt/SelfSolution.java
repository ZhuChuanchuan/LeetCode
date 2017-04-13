package com.tom.d013RomanToInt;

public class SelfSolution {

	public static int romanToInt(String s) {
		int res=0;
		int max=-1;
		for(int i=s.length()-1;i>=0;i--){
			int curV=getV(s.charAt(i));
			if(curV>=max){
				max=curV;
				res+=curV;
			}else{
				res-=curV;
			}
		}
		return res;
    }
	private static int getV(char c){
		switch(c){
			case 'I':return 1;
	        case 'X':return 10;
	        case 'C':return 100;
	        case 'V':return 5;
	        case 'L':return 50;
	        case 'D':return 500;
	        case 'M':return 1000;
		}
		return 0;
	}
}
