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
    int ans = 0;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return ans;
    }

    void dfs(TreeNode node, int min, int max) {

        if (node == null) {
            return;
        }

        // Calculate difference with ancestors
        ans = Math.max(ans, Math.abs(node.val - min));
        ans = Math.max(ans, Math.abs(node.val - max));

        // Update minimum and maximum values
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);

        // Traverse left and right subtrees
        dfs(node.left, min, max);
        dfs(node.right, min, max);
    }
}
