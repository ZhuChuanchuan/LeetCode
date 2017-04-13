package com.tom.d205IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @ question: leetcode -205 Isomorphic Strings
 * @ author: tom
 * @ time:2017-2-16 10:10:12
 */
public class SelfSolution {
public static boolean isIsomorphic(String s, String t) {
	Set<Character> usedSet = new HashSet<>();
    Map<Character,Character> charMap = new HashMap<>();
    for(int i = 0; i < s.length(); i++){
        Character ch = charMap.get(s.charAt(i));
        Character si = s.charAt(i);
        Character ti = t.charAt(i);
        if(ch == null){
            if(usedSet.contains(ti) == false){
                charMap.put(si, ti);
                usedSet.add(ti);
            }
            else return false;
        }
        else{
            if(ch != ti) return false;
        }
    }
    return true;
    }
}
