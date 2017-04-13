package com.tom.d007reverseInteger;

/*
 * 思路：通过 / %操作，不另开辟空间
 * */
public class SuperiorSolution {
	public static int reverse(int x) {  
		long count = x;
		long result = 0;
		
		while (count!=0) {
		    result*=10;
		    result += (count%10);
		    count/=10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		return (int)result;
    }  
}
