package com.ioana;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static TreeNode invertTree(TreeNode root) {

        if(root == null) {

            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swap
        root.left = right;
        root.right = left;

        return root;

    }
}
