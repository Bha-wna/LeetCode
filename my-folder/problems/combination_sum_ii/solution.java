class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates);
       List<List<Integer>> ans = new ArrayList<>(); 
       cs2(0, candidates, target, ans, new ArrayList<>());
        
       return ans; 
        
    }
    
    public void cs2(int ind, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> ds)
    {
        if(target ==0)
        {     ans.add(new ArrayList<>(ds));
           return;
        }
        
        for(int i=ind; i<candidates.length; i++)
        { 
             if(candidates[i] > target) break;
            
            if(i>ind && candidates[i] == candidates[i-1]) continue;
           
            ds.add(candidates[i]);
            cs2(i+1,candidates, target - candidates[i], ans, ds);
            ds.remove(ds.size()-1);
                
        }
    }
}