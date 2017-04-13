package com.tom.d104depth;

import com.tom.common.TreeNode;

public class SelfSolution {
/*
 * question:Maximum Depth of Binary Tree
 * author:tom
 * time:2016-12-8 08:48:45
 */
public int maxDepth(TreeNode root) {
        if(root==null)
        	return 0;
        int depth=0;
        
        int ldepth=maxDepth(root.left);
        int rdepth=maxDepth(root.right);
        depth++;
        if(ldepth>rdepth)
        	depth=depth+ldepth;
        else
        	depth=depth+rdepth;
        return depth;
    }
}
