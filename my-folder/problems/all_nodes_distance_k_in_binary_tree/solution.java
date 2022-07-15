/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void markParents(TreeNode root, Map<TreeNode, TreeNode> parents_track)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if(curr.left != null)
            {   q.offer(curr.left);
                parents_track.put(curr.left,curr);
            }
            if(curr.right != null)
            {
                q.offer(curr.right);
                parents_track.put(curr.right, curr);
            }
        }
      //  System.out.println(parents_track);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parents_track = new HashMap<>();
        markParents(root, parents_track);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target,true);
        int dis =0;
        while(!queue.isEmpty())
        {   
            int len = queue.size();
            if(dis==k) 
                break;
            dis++;
            for(int i=0; i<len; i++)
            {
              TreeNode temp = queue.poll();
              if(temp.left != null && visited.get(temp.left) == null)
              {
                queue.offer(temp.left);
                visited.put(temp.left, true);
              }
              if(temp.right != null && visited.get(temp.right) == null)
              {
                queue.offer(temp.right);
                visited.put(temp.right, true);
              }
              if(parents_track.get(temp) != null && visited.get(parents_track.get(temp))== null)
              {
                  queue.offer(parents_track.get(temp));
                  visited.put(parents_track.get(temp),true);
              }
            }   
        }
        
      List<Integer> ans = new ArrayList<>();
      while(!queue.isEmpty())
      {
          TreeNode t = queue.poll();
          ans.add(t.val);
      }
      return ans;  
    }
   
}