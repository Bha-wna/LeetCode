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
    public int widthOfBinaryTree(TreeNode root) {
        int ans =0;
        Queue<Pair> q = new LinkedList<>();
        if(root==null)
            return ans;
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            int len= q.size();
            int last=0; int first =0;
            int min = q.peek().num;
            for(int i=0; i<len;i++)
            {
                int curr = q.peek().num-min;
                TreeNode temp = q.peek().node;
                q.poll();
                if(i==0)first= curr;
                if(i==len-1)last = curr;
                if(temp.left != null)
                    q.offer(new Pair(temp.left,2*curr));
                if(temp.right != null)
                    q.offer(new Pair(temp.right, 2*curr + 1));
                
            }
            ans = Math.max(ans, last-first+1);
        }
        return ans;
    }
    
    
}

class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node, int _num)
    {
        node = _node;
        num = _num;
    }
}