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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        boolean gap = false;

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr.left!=null){
                if(gap) return false;
                q.add(curr.left);
            }
            else{
                gap = true;
            }
            if (curr.right != null) {
                if (gap) return false;
                q.offer(curr.right);
            } else {
                gap = true;
            }
        }

        return true;


        
    }
}