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
    public int maxLevelSum(TreeNode root) {
        int maxi =Integer.MIN_VALUE;  int level =0;int ans =0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int len = q.size();
            level++;
            int sum =0;
            for(int i=0; i<len; i++)
            {
                TreeNode temp = q.poll();
                sum = sum + temp.val;
                if(temp.left != null)
                    q.offer(temp.left);
                
                if(temp.right != null)
                    q.offer(temp.right);
            }
            if(sum > maxi)
            { maxi = sum;
                ans = level; 
            }
        }
            
        return ans;
    }

}