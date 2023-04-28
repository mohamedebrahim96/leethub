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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // condition checking for root nodes
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(p);
        st2.push(q);

        while (!st1.empty() && !st2.empty()) {
            TreeNode n1 = st1.pop();
            TreeNode n2 = st2.pop();

            // check if values are equal
            if (n1.val != n2.val) {
                return false;
            }
            // condition checking for children nodes
            if ((n1.left != null && n2.left == null) || (n1.left == null && n2.left != null)) {
                return false;
            }
            if ((n1.right != null && n2.right == null) || (n1.right == null && n2.right != null)) {
                return false;
            }

            // add the children to the stacks
            if (n1.left != null && n2.left != null) {
                st1.push(n1.left);
                st2.push(n2.left);
            }
            if (n1.right != null && n2.right != null) {
                st1.push(n1.right);
                st2.push(n2.right);
            }
        }

        // any dissimilarity if encountered above, would've returned false already
        // no dissimilarity encountered means trees are same, so return true
        return true;
    }
}