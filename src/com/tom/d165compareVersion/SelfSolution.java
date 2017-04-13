package com.tom.d165compareVersion;

public class SelfSolution {
/*
 * question:Leetcode -165 Compare Version Numbers
 * author:tom
 * time:2016-12-22 08:31:53
 */
public static int compareVersion(String version1, String version2) {
        String[] c1=version1.split("\\.");
        String[] c2=version2.split("\\.");
        
        int maxlen=Math.max(c1.length, c2.length);
        for(int i=0;i<maxlen;i++){
        	int v1=i<c1.length?Integer.parseInt(c1[i]):0;
        	int v2=i<c2.length?Integer.parseInt(c2[i]):0;
        	if(v1!=v2)
        		return v1>v2?1:-1;
        }
      return 0;
    }
}
