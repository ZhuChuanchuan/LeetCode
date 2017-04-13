package com.tom.d101Symmetric;

import com.tom.common.TreeNode;

public class SelfSolution {
	/*
	 * question: Symmetric tree author:tom time:2016-12-7 10:22:01
	 */
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isMirror(root.left, root.right);
	}

	/**
	 * �ж�һ�Ŷ��������������ӽڵ��Ƿ�Գ�
	 * 
	 * @param leftNode
	 *            ���ӽڵ�
	 * @param rightNode
	 *            ���ӽڵ�
	 * @return true���Գ� false�����Գ�
	 */
	public boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
		if (leftNode == null && rightNode == null) {
			return true;
		} else if ((leftNode != null && rightNode == null) || (leftNode == null && rightNode != null)
				|| leftNode.val != rightNode.val || !isMirror(leftNode.left, rightNode.right)
				|| !isMirror(leftNode.right, rightNode.left)) {
			return false;
		} else {
			return true;
		}
	}
}
