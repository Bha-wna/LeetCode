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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode dummy = root;
        if(root == null)
            return null;
        
        if(root.val == key)
            return helper(root);
        
        while(root != null)
        {
            if(root.val > key)
            {
                if(root.left != null && root.left.val == key)
                {
                    root.left = helper(root.left);
                    break;
                }
                else
                    root = root.left;
            }
            else
            {
              if(root.right != null && root.right.val == key)
              {
                  root.right = helper(root.right);
                  break;
              }
              else
                  root = root.right;
            }
        }
        return dummy;
    }
    public TreeNode helper(TreeNode root)
    {
        if(root.left ==null)
            return root.right;
        
        else if(root.right == null)
            return root.left;
        
        TreeNode rightChild = root.right;
        TreeNode leftRight = rightMostinLeft(root.left);
        leftRight.right = rightChild;
        return root.left;
    }
    public TreeNode rightMostinLeft(TreeNode root)
    {
        if(root.right == null)
            return root;
        
        return rightMostinLeft(root.right);
    }
}