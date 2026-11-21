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

class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxSum;
    }

    public int findMax(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // Get maximum gain from left and right subtrees
        int left = Math.max(0, findMax(root.left));
        int right = Math.max(0, findMax(root.right));
        
        // Maximum path passing through current node
        int currentSum = root.val + left + right;

        // Update global maximum
        maxSum = Math.max(maxSum, currentSum);

        // Return maximum one-sided path to parent
        return root.val + Math.max(left, right);
    }
}
