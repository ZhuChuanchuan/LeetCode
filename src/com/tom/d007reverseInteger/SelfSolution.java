package com.tom.d007reverseInteger;

public class SelfSolution {
	/*
	 * 分析：stringbuild做reverse，考虑int范围溢出问题
	 */
	public static int reverse(int x) {
		long num=x;
		boolean positive=true;
		if(num!=Math.abs(num)){
			positive=false;
			num=-num;
		}
		StringBuilder sb=new StringBuilder();
		sb.append(String.valueOf(num));
		long reverseNum=0;
		reverseNum = Long.parseLong(sb.reverse().toString());
		//考虑int类型的范围
		if(reverseNum>Integer.MAX_VALUE||reverseNum<Integer.MIN_VALUE){
			return 0;
		}
		if(!positive){
			reverseNum=-reverseNum;
		}
		return (int)reverseNum;
    }
}
