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
class Solution 
{
    // it will be updated to false if we find size difference, or diff value
    boolean value = true;

    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if(p == null && q == null)
            return true;

        //one tree is null, while other is not
        else if(p == null || q == null)
            return false;

        traverse(p, q);    
        return value;           
    }

    public void traverse (TreeNode ptr1, TreeNode ptr2)
    {
        //same size if verified
        if(ptr1 == null && ptr2 == null)
            return;

        // if one tree is diff then the other in size
        else if(ptr1 == null || ptr2 == null)
        {
            value = false;
            return;
        }

        traverse(ptr1.left, ptr2.left);

        if(ptr1.val != ptr2.val)
        {
            value = false;
            return;
        }

        traverse(ptr1.right, ptr2.right);
    }
}