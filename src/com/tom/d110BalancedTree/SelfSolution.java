package com.tom.d110BalancedTree;

import com.tom.common.TreeNode;

public class SelfSolution {
/*
 * question:Balanced Binary Tree
 * author:tom
 * time:2016-12-8 10:56:37
 */
public boolean isBalanced(TreeNode root) {
        if(root==null) 
        	return true;
        if(root.left==null&&getDepth(root.right)<=1)
        	return true;
        if(root.right==null&&getDepth(root.left)<=1)
        	return true;
        if(getDepth(root.left)-getDepth(root.right)>1||getDepth(root.right)-getDepth(root.left)>1)
        	return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }

private int getDepth(TreeNode root) { //获取当前节点的深度
	if(root==null)
		return 0;
	if(root.left==null&&root.right==null)
		return 1;
	int ldepth=getDepth(root.left);
	int rdepth=getDepth(root.right);
	
	return ldepth>rdepth?ldepth+1:rdepth+1;
}
}
