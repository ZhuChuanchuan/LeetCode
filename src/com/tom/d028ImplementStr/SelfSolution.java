package com.tom.d028ImplementStr;

public class SelfSolution {
/*
 * 分析：从第一个字符开始比较，逐个比较字符，如果完全匹配，返回i的值
 */
public static int strStr(String haystack, String needle) {
	for (int i = 0; i <= haystack.length() - needle.length(); i++) { //i值取到 主串长度-子串长度
		int tempCursor = i;
		int startIndex = 0;
		int endIndex = needle.length();
		while (startIndex < endIndex&&haystack.charAt(tempCursor) == needle.charAt(startIndex) ) {
			tempCursor++;
			startIndex++;
		}
		if (startIndex == endIndex) {
			return i;
		}
	}
	return -1;
    }
}
