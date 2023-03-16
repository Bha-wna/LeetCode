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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    Map<Integer, Integer> inMap = new HashMap<>();
        
      for(int i=0; i< inorder.length; i++)
      {
          inMap.put(inorder[i],i);
      }
      
      TreeNode root = buildTree(inorder, 0,inorder.length-1, postorder, 0, postorder.length-1, inMap);  
       return root;   
    }
    
    public TreeNode buildTree(int[] inorder, int instart, int inend, int[] postorder, int poststart,int postend, Map<Integer, Integer> inMap )
    {
        if(instart > inend || poststart > postend)
            return null;
        
        TreeNode root = new TreeNode(postorder[postend]);
        
        int inRoot = inMap.get(root.val);
       int  inLeft = inRoot-instart;
            
        root.left = buildTree(inorder,instart,inRoot-1, postorder, poststart, poststart+inLeft-1,inMap);
        
        root.right = buildTree(inorder, inRoot+1, inend, postorder, poststart+inLeft, postend-1,inMap);
        
        return root;
    }
}