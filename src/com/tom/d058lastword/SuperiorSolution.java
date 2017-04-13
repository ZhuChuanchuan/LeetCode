package com.tom.d058lastword;

public class SuperiorSolution {
	/*
	 * 分析：不另开辟空间
	 */
	public int lengthOfLastWord(String s) {
		s = s.trim();//字符串前后空格去掉
	    int lastIndex = s.lastIndexOf(' ') + 1;
	    return s.length() - lastIndex;        
	}
}
