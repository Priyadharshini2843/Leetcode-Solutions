
class Solution {

    Set<Integer> set = new HashSet<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        for (int x : to_delete) {
            set.add(x);
        }

        root = dfs(root);

        if (root != null) {
            ans.add(root);
        }

        return ans;
    }

    TreeNode dfs(TreeNode node) {

        if (node == null) return null;

        node.left = dfs(node.left);
        node.right = dfs(node.right);

        if (set.contains(node.val)) {

            if (node.left != null) {
                ans.add(node.left);
            }

            if (node.right != null) {
                ans.add(node.right);
            }

            return null;
        }

        return node;
    }
}
