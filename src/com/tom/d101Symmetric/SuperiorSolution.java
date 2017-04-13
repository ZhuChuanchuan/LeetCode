package com.tom.d101Symmetric;

import com.tom.common.TreeNode;

public class SuperiorSolution {
/*
 * question:Symmetric Tree
 * author:tom
 * time:2016-12-7 10:03:56
 */
	public boolean isSymmetric(TreeNode root) {
	    return root==null || isSymmetricHelp(root.left, root.right);
	}
	private boolean isSymmetricHelp(TreeNode left, TreeNode right){
	    if(left==null || right==null)
	        return left==right;
	    if(left.val!=right.val)
	        return false;
	    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
}
