package com.tom.d014prefix;

public class SelfSolution {
/*
 * 分析：先找出最短的串，与数组中逐一比较，记录每次共同字串的长度，取最小的，就是最长公共前缀
 */
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0)return "";
        if(strs.length==1) return strs[0];
		//找出最短的串
		String minStr=strs[0];
		for(int i=1;i<strs.length;i++ ){
			if(strs[i].length()<minStr.length()){
				minStr=strs[i];
			}
		}
		int len=minStr.length();
		for(int i=0;i<strs.length;i++){
			int curLen=0;
			while(curLen<minStr.length()&&strs[i].charAt(curLen)==minStr.charAt(curLen)){ //匹配每一个字符串
				curLen++;
			}
			if(curLen<len){ //取最短的公共索引
				len=curLen;
			}
		}
		
		return minStr.substring(0, len);
    }
}
