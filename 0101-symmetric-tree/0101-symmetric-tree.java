/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();
        leftQueue.add(root.left);
        rightQueue.add(root.right);

        while(!leftQueue.isEmpty() && !rightQueue.isEmpty()){
            TreeNode leftTreeNode = leftQueue.remove();
            TreeNode rightTreeNode = rightQueue.remove();

            if(leftTreeNode == null && rightTreeNode == null) continue;
            if(leftTreeNode == null || rightTreeNode == null) return false;
            if(leftTreeNode.val != rightTreeNode.val) return false;

            leftQueue.add(leftTreeNode.left);
            leftQueue.add(leftTreeNode.right);
            rightQueue.add(rightTreeNode.right);
            rightQueue.add(rightTreeNode.left);
        }
        return true;
    }
}