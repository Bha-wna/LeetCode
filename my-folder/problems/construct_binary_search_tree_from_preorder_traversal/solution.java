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
    public TreeNode bstFromPreorder(int[] preorder) {
      Map<Integer, Integer> preMap = new HashMap<>();
        for(int i=0; i< preorder.length; i++)
        {
            preMap.put(preorder[i],i);
          
        }
          return bstFromPreorder( preorder, 0, preorder.length-1, preMap);
    }
    public TreeNode bstFromPreorder(int[] preorder, int preStart, int preEnd, Map<Integer, Integer> preMap)
    {
        if(preStart> preEnd)
            return null;
        int index = preMap.get(preorder[preStart]);
        System.out.println("index :" + index);
        TreeNode root = new TreeNode(preorder[index]);
        
        int leftCount =0;
        for(int i=preStart; i<=preEnd;i++)
        {
            if(preorder[i]<root.val)
                leftCount++;
        }
        System.out.println(leftCount);
       
        root.left = bstFromPreorder( preorder, preStart+1, preStart + leftCount, preMap);
        root.right = bstFromPreorder( preorder, preStart+leftCount+1 , preEnd, preMap);
        
        return root;    
    }
}