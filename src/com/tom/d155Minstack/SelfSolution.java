package com.tom.d155Minstack;

import java.util.Stack;

public class SelfSolution {
/*
 * question£ºLeetcode -155 Min Stack
 * author£ºtom
 * time£º2016-12-21 09:07:46
 */
	Stack<Integer> s=new Stack<Integer>();
	Stack<Integer> sm=new Stack<Integer>();
	
	public void push(int x) {
        s.push(x);
        if(sm.isEmpty()||(!sm.isEmpty()&&sm.peek()>=x))
        	sm.push(x);
    }
    
    public void pop() {
        
        if(s.peek()==sm.peek())
        	sm.pop();
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return sm.peek();
    }
	
	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
}
