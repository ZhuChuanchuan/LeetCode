package com.tom.d112PathSum;

import com.tom.common.TreeNode;

public class SuperiorSolution {
	/*
	 * question:Path sum
	 * author:tom
	 * time:2016-12-11 22:01:15
	 */
public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
        	return false;
        if(root.left==null&&root.right==null&&sum==root.val)
        	return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
