class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> al = new ArrayList<>();
        
        allCombination(0,candidates,target,al,new ArrayList<>());
        return al;
    }
    
    public void allCombination(int ind, int[] candidates, int target, List<List<Integer>> al, List<Integer> l )
    {
        if(ind == candidates.length)
        {
            if(target==0)
                al.add(new ArrayList<>(l));
            return ;
        }
        
        if(candidates[ind] <= target)
        {
            l.add(candidates[ind]);
            allCombination(ind,candidates,target-candidates[ind],al,l);
            l.remove(l.size()-1);
        }
        
        allCombination(ind+1, candidates, target, al, l);
        //return al;
    }
}