/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
      String serialize = "";
      if(root == null)
          return "";
      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
       while(!q.isEmpty())
       {
           int size = q.size();
          
           for(int i=0; i<size; i++)
           {   
                TreeNode temp = q.poll();
               if(temp != null)
               {
                int val = temp.val;
                String s = Integer.toString(val);
                serialize += s +"," ;
               if(temp.left != null)
                   q.offer(temp.left);
               else
                   q.offer(null);
               if(temp.right != null)
                   q.offer(temp.right);
               else
                   q.offer(null);
               }
               else
                   serialize += null +"," ;
           }
       }
       System.out.println(serialize);
        return serialize;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      if(data == "")
          return null;
       Queue<TreeNode> q = new LinkedList<>();
       String arr[] = data.split(",") ;
       TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
       q.offer(root);
       for(int i=1; i<arr.length; i++)
       {  
          TreeNode parent = q.poll(); 
          if(!arr[i].equals("null"))
          {
             TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
              parent.left = left;
              q.offer(left);
          }
          if(!arr[++i].equals("null"))
          {
             TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
              parent.right = right;
              q.offer(right);
          } 
       }
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));