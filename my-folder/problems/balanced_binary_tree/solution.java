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
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }
    public int dfsheight(TreeNode root)
    {
        if(root == null) 
            return 0;
    
         int lh = dfsheight(root.left); System.out.println(lh);
         if(lh== -1) return -1;
         int rh = dfsheight(root.right); System.out.println(rh);
         if(rh==-1) return -1;
        
         if(Math.abs(lh-rh)>1) return -1;
         
         return 1+Math.max(lh,rh);
    }
}