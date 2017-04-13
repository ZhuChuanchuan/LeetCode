package com.tom.d058lastword;

public class SelfSolution {

	public  static int lengthOfLastWord(String s) {
		if(s=="")
            return 0;
        String[] strs=s.split(" ");
        if(strs.length>0)
            return strs[strs.length-1].length();
        else
        	return 0;
    }
}
