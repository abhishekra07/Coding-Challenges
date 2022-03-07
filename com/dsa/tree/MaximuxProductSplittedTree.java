package com.dsa.tree;

public class MaximuxProductSplittedTree {

	public static int  ans = 0, totalSum = 0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		insert(root, 4);
		insert(root, 3);
		insert(root, 5);
		insert(root, 8);
		insert(root, 7);
		insert(root, 9);
		System.out.println(maxProduct(root));
	}

	public static int maxProduct(TreeNode root) {
		totalSum = dfs(root);
		dfs(root);
		return (int)  (ans % (1e9+ 7));
	}

	public static int dfs(TreeNode root) {
		if(root == null) return 0;
		int sum = dfs(root.left) + dfs(root.right) + root.val;
//		System.out.println(sum + " " + root.val);
		ans = Math.max(ans, (totalSum - sum ) * sum);
		return sum;
	}
	
	public static TreeNode insert(TreeNode node, Integer value) {
		if(node == null)
			return new TreeNode(value);
		
		if(value > node.val) {
			node.right = insert(node.right, value);
		} else {
			node.left = insert(node.left, value);
		}
		return node;
	}
}

/**
 * Definition for a binary tree node.\
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}