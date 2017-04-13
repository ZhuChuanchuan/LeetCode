package com.tom.d006zigzag;

public class SuperiorSolution {

	public static String convert(String s, int numRows) {
	    if (numRows <= 1||s.length()<=numRows) {
	        return s;
	    }
	    int n = s.length();
	    int rowSpan = 2 * numRows - 2;
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < numRows; i++) {
	        for (int j = i; j < n; j += rowSpan) {
	            sb.append(s.charAt(j));
	            if (i != 0 && i != numRows - 1 && j + rowSpan - 2 * i < n) { //������β�У�j+rowSpanΪ��һ�е�������-2*iΪ�м������е�����
	                sb.append(s.charAt(j + rowSpan - 2 * i));
	            }
	        }
	    }
	    return sb.toString();
	}
}
