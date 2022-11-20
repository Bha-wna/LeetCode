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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr = inorder(root,arr1);
      //  System.out.println(inorder(root,arr1));
       // System.out.println(arr);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<queries.size();i++)
        {
            int num = queries.get(i);
            ArrayList<Integer> temp = new ArrayList<>();
           
                int b = findmini(arr,num);
               // System.out.println(b +" , num " + num);
                if(b<=num)
                    temp.add(b);
                else
                    temp.add(-1);
                
               int a = findmaxi(arr,num);
              //  System.out.println(a +" , num " + num);
                if(a>=num)
                    temp.add(a);
                else
                    temp.add(-1);
                    
                ans.add(temp);
                 
        }
        return ans;
        
    }
    public static List<Integer> inorder(TreeNode root, List<Integer> arr)
    {
        if(root==null)
            return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        
        return arr;
    }
    public static int findmaxi(List<Integer> arr, int num)
    {
                int l = 0;
                int r = arr.size()-1;
                int maxi = arr.get(arr.size()-1);
                int it=0;
                while(l<=r)
                {
                    int mid = l+(r-l)/2;
                    if(arr.get(mid)==num)
                        return arr.get(mid);
                    if(arr.get(mid)>num)
                        maxi = Math.min(maxi,arr.get(mid));
                    if(arr.get(mid)>num)
                    {
                        r = mid-1;
                    }
                    else
                    {
                        l = mid + 1; 
                    }
                    it++;
                }
        return maxi;
    }
    public static int findmini(List<Integer> arr, int num)
    {
                int l = 0;
                int r = arr.size()-1;
                int mini = -1;
                int it =0;
                while(l<=r)
                {
                    int mid = l+(r-l)/2;
                    if(arr.get(mid)==num)
                        return arr.get(mid);
                    if(arr.get(mid) <num) 
                        mini = Math.max(mini,arr.get(mid));
                    if(arr.get(mid)>num)
                    {
                        r = mid-1;
                    }
                    else
                    {
                        l = mid + 1; 
                    }
                    it++;
                }
        return mini;
    }
}