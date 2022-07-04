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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return ans;
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int len =  q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<len; i++)
            {
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                l.add(q.poll().val);
            }
            ans.add(l.get(l.size()-1));
        }
        return ans;
    }
}