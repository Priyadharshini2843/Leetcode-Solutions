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
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return result;
    }

    private String dfs(TreeNode node) {
        if (node == null) return "#";

        String left = dfs(node.left);
        String right = dfs(node.right);

        String s = node.val + "," + left + "," + right;

        map.put(s, map.getOrDefault(s, 0) + 1);

        if (map.get(s) == 2) {
            result.add(node);
        }

        return s;
    }
}