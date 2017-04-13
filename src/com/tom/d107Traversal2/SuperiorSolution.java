package com.tom.d107Traversal2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tom.common.TreeNode;

public class SuperiorSolution {
	/*
	 * question:Binary Tree Level Order Traversal II
	 * author:tom
	 * time:2016-12-8 10:36:40
	 */
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }
    public void  levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(0,new LinkedList<Integer>());
        }
        
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
        res.get(res.size()-height-1).add(root.val);
    }
}
