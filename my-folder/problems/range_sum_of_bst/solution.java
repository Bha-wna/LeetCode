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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> arr = new ArrayList<>();
        arr = inorder(root, arr);
        int sum =0;
        for(int i=0; i<arr.size(); i++)
        {
           if(arr.get(i)<= high && arr.get(i)>= low)
             sum += arr.get(i);
        }
        return sum;
    }

    public List<Integer> inorder(TreeNode root, List<Integer> arr)
    {
        if(root==null)
          return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);

        return arr;
    }
}