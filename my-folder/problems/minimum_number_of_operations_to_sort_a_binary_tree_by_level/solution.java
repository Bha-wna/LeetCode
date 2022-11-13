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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count =0;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<size; i++)
            {
                TreeNode front = q.peek();
                q.poll();
                l.add(front.val);
                if(front.left != null)
                    q.offer(front.left);
                if(front.right != null)
                    q.offer(front.right);
            }
            count += minSwaps(l);
        }
        return count;
    }
   static int minSwaps(List<Integer> l)
   {
       int len = l.size();
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<len; i++)
       {
           map.put(l.get(i),i);
       }
       Collections.sort(l);
       int[] visited = new int[len];
       
       int ans =0;
       for(int i=0; i<len; i++)
       {
           if(visited[i] ==1 || map.get(l.get(i)) == i)
               continue;
           int j =i, cycle_size =0;
           while(visited[j] !=1)
           {
               visited[j] = 1;
               j = map.get(l.get(j));
               cycle_size++;
           }
           if(cycle_size >0)
               ans+= (cycle_size-1);
       }
       return ans;
   }
}