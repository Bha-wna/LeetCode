class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
       //map will store freq of 2nd elements
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i=0; i<matches.length; i++)
        {
            if(!m.containsKey(matches[i][1]))
                m.put(matches[i][1],1);
            else
                m.put(matches[i][1],m.get(matches[i][1])+1);
        }
        //set will contain ans[0]
        Set<Integer> s = new HashSet<>();
         for(int i=0; i<matches.length; i++)
         {
             if(!m.containsKey(matches[i][0]))
                 s.add(matches[i][0]);
         }
        
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer0 = new ArrayList<>();
        
        for(int it : s)
        {
            answer0.add(it);
        }
        
        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            if(entry.getValue()==1)
                answer1.add(entry.getKey());
        }
        
        Collections.sort(answer0);
        Collections.sort(answer1);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(answer0);
        ans.add(answer1);
        
        return ans;
    }
}