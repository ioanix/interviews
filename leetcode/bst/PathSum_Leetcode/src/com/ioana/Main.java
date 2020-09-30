package com.ioana;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int sum) {

        if(root == null) {  // root is the node that we are currently at, not the head of the tree

            return false;
        }

        if(sum == root.val && root.right == null && root.left == null) {

            return true;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
