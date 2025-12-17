package com.example.demo;

public class Validate_Binary_Search_Tree {

    public class TreeNode {
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

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean isValid(TreeNode root, int left, int right) {
        if (root == null)
            return true;
        if (root.val < right && left < root.val)
            return isValid(root.left, left, root.val) && isValid(root.right, root.val, right);
        return false;
    }
}
