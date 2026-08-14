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
    public static void levelOrder(TreeNode root, List<Integer> array){
        if(root == null){
            array.add(null);
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if (currNode == null) {
                array.add(null);
            } else {
                array.add(currNode.val);

                q.add(currNode.left);
                q.add(currNode.right);
            }
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> p_list = new ArrayList<>();
        List<Integer> q_list = new ArrayList<>();

        levelOrder(p, p_list);
        levelOrder(q, q_list);

        return p_list.equals(q_list);
    }
}