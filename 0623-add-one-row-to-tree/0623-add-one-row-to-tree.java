class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        // If depth is 1, create a new root
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        // Recursively traverse the tree
        addRow(root, val, depth, 1);

        return root;
    }

    private void addRow(TreeNode node, int val, int depth, int level) {

        if (node == null) {
            return;
        }

        // Find nodes at depth - 1
        if (level == depth - 1) {

            TreeNode oldLeft = node.left;
            TreeNode oldRight = node.right;

            // Create new nodes
            node.left = new TreeNode(val);
            node.right = new TreeNode(val);

            // Attach original subtrees
            node.left.left = oldLeft;
            node.right.right = oldRight;

            return;
        }

        // Traverse left and right subtrees
        addRow(node.left, val, depth, level + 1);
        addRow(node.right, val, depth, level + 1);
    }
}