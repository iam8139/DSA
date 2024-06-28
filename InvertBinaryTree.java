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
class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = right;
        root.right = left;
        invertTree(left);
        invertTree(right);

        return root;
    }
}
