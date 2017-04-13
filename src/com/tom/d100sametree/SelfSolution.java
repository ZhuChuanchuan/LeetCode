package com.tom.d100sametree;

import com.tom.common.TreeNode;

public class SelfSolution {
/*
 * question:same tree
 * author:tom
 * time:2016-12-7 09:32:00
 */
	
public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if((p==null&&q!=null)||(p!=null&&q==null)||q.val!=p.val)
        	return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
