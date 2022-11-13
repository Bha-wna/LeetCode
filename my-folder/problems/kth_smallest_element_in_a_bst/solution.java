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
         List<Integer> in = new ArrayList<Integer>();
       List<Integer> ans = inorder(root,in);
       int res =0;
       for(int i=0; i<k; i++)
       {
          res = ans.get(i);
       }
       return res;
    }
    static List<Integer> inorder(TreeNode root, List<Integer> in)
    {
       if(root==null)
         return in; 
       inorder(root.left,in);
       in.add(root.val);
       inorder(root.right,in);
        return in;
    }
}