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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        if(root.left==null &&root.right==null){
            return true;
        }
        
        if(root.left!=null && root.right!=null && root.left.val==root.right.val){
            return mirror(root.left,root.right);
        }
        return false;
    }

    public boolean mirror(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null )
            return false;
        
        if(left.left!=null && right.right!=null && left.left.val!=right.right.val){
            return false;
        }
        if(left.right!=null && right.left!=null && left.right.val!=right.left.val)
            return false;

        return mirror(left.left,right.right) && mirror(left.right,right.left);
    
    }
}