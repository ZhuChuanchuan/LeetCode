package com.tom.d014prefix;

public class SuperiorSolution {
	/*
	 * 分析：巧用了indexof进行整个字符串比较，substring从尾至头进行截取
	 */
	public static String longestCommonPrefix(String[] strs) {
        String res = strs.length == 0 ? "" : strs[0];
        for(int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(res) != 0) 
                res=res.substring(0, res.length()-1);
        return res;
    }
}
