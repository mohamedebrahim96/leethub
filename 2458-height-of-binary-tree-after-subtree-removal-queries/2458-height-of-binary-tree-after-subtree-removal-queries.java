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
  
  public int[] treeQueries(TreeNode root, int[] queries) {
    countNodesAndLevels(root);
    
    N = new int[nodes+1][2];  
    L = new int[levels][2];
    
    for(int i = 0; i != levels; i++) L[i][0] = L[i][1] = -1;
  
    fillTables(root, 0);
    fillQueries(queries);
    
    return queries;
  }

//count number of all nodes and all levels
  private int nodes  = 0;
  private int levels = 0;
  
  private void countNodesAndLevels(TreeNode root){
    LinkedList<TreeNode> q = new LinkedList<>();
    q.add(root);
    
    for(; !q.isEmpty(); levels++)
      for(int n = q.size(); n-- != 0;){
        root = q.pollLast();
        nodes++;
        
        if(root.left  != null) q.addFirst(root.left);
        if(root.right != null) q.addFirst(root.right);
      }
  }
  
//fill tables of maximum lengt for each node and two maximums for each level
  private int N[][];                    //[level_of_node_][maximal_path]
  private int L[][];                    //two maximal pathes
  
  private void fillTables(TreeNode root, int level){
    N[root.val][0] = level;
    
    if(root.left  != null) {
      fillTables(root.left,  level + 1);
      N[root.val][1] = N[root.left.val][1] + 1;
    }
    if(root.right != null) {
      fillTables(root.right, level + 1);
      N[root.val][1] = Math.max(N[root.val][1], N[root.right.val][1] + 1);
    }
    
    if(L[level][1] <= N[root.val][1]){
      L[level][0] = L[level][1];
      L[level][1] = N[root.val][1];
    }else if(L[level][0] < N[root.val][1])
      L[level][0] = N[root.val][1];
  }
  
//fill queries
  private void fillQueries(int[] q){
    for(int i = 0; i != q.length; i++){
      int level = N[q[i]][0];
      int maxi  = N[q[i]][1];
      
      if(L[level][1] == N[q[i]][1]) q[i] = level + L[level][0];
      else                          q[i] = level + L[level][1]; 
    }
  }
}