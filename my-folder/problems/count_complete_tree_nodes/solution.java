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
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int lh = countLH(root.left);
        int rh = countRH(root.right);
        
        if(lh==rh)
            return (int)Math.pow(2,lh)-1;
        return countNodes(root.left)+ countNodes(root.right) +1;
    }
    static int countLH(TreeNode root)
    {  
        int ct =1;
        while(root != null)
        {
            root = root.left;
            ct++;
        }
        return ct;
    }
    static int countRH(TreeNode root)
    {  
        int ct =1;
        while(root != null)
        {
            root = root.right;
            ct++;
        }
        return ct;
    }
    
}