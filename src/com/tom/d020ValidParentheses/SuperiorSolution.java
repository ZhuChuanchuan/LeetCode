package com.tom.d020ValidParentheses;

import java.util.Stack;

public class SuperiorSolution {
	public static boolean isValid(String s) {
        Stack<Character> strings = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                strings.push(s.charAt(i));
            }
            if (s.charAt(i) == '}') {
                if (strings.isEmpty() || strings.pop() != '{') {
                    return false;
                }
            } else if (s.charAt(i) == ')') {
                if (strings.isEmpty() || strings.pop() != '(') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (strings.isEmpty() || strings.pop() != '[') {
                    return false;
                }
            }
        }
        if (strings.isEmpty()) {
            return true;
        }
        return false;
    }
}
