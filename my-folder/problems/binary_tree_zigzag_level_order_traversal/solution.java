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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> al = new ArrayList<List<Integer>>();
       Queue<TreeNode> q = new LinkedList<>();
        
        if(root== null)
            return al;
        
        boolean flag = true;
        q.offer(root);
        while(!q.isEmpty())
        {
            int s = q.size();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0; i<s; i++)
            {
                
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                if(q.peek().right != null)
                    q.offer(q.peek().right);
                if(flag==true)
                    l.add(q.poll().val);
                else
                    l.add(0,q.poll().val);
            }
            flag = !flag;
            al.add(l);
        }
        return al;
    }
}