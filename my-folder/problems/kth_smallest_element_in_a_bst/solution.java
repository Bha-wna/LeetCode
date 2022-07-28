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
    public int kthSmallest(TreeNode root, int k) {
       int[] arr = new int[]{k};
        TreeNode kthsmallest = helper(root, arr);
        return kthsmallest.val;
    }
    
    public TreeNode helper(TreeNode root, int[]arr)
    {
        if(root==null)
            return null;
        
        TreeNode left = helper(root.left, arr);
        if(left != null)
            return left;
        arr[0]--;
        if(arr[0]==0)
            return root;
        
        return helper(root.right, arr);
            
    }
}