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
class Tuple
{
    TreeNode node;
    int row; 
    int col;
    public  Tuple(TreeNode _node, int _row, int _col)
    {
        node = _node;
        row = _row;
        col = _col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       Queue<Tuple> q = new LinkedList<>();
       TreeMap<Integer, TreeMap<Integer,PriorityQueue<Integer>>> tm = new TreeMap<>(); 
        
       q.offer(new Tuple(root,0,0));
       while(!q.isEmpty())
       {
          Tuple t = q.poll(); 
          TreeNode n = t.node;
          int x = t.row;
          int y = t.col;
           
          if(!tm.containsKey(x))
              tm.put(x, new TreeMap<>());
           
          if(!tm.get(x).containsKey(y)) 
              tm.get(x).put(y, new PriorityQueue<>());
           
           tm.get(x).get(y).offer(n.val);
           
           if(n.left != null)
               q.offer(new Tuple(n.left, x-1, y+1));
           if(n.right != null)
               q.offer(new Tuple(n.right, x+1, y+1));
       }
        
       for(TreeMap<Integer,PriorityQueue<Integer>> v : tm.values()) 
       {
           ans.add(new ArrayList<>());
           for(PriorityQueue<Integer> p : v.values())
           {
               while(! p.isEmpty())
               {
                   System.out.println(p.peek());
                   ans.get(ans.size()-1).add(p.poll());
               }
           }
       }
       return ans; 
    }
}