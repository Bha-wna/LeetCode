class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> m = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            if(!m.containsKey(words[i]))
                m.put(words[i],1);
            else
                m.put(words[i],m.get(words[i])+1);
        }
        
        LinkedHashMap<String,Integer> rm = new LinkedHashMap<>();
        m.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
  .forEachOrdered(x -> rm.put(x.getKey(), x.getValue()));
        
       System.out.println(rm);
        List<String> ans = new ArrayList<>();
        List<String> result = new ArrayList<>();
        
        Map.Entry<String, Integer> entry = rm.entrySet().iterator().next();
        int prev = entry.getValue();
       
            for (Map.Entry<String, Integer> ite : rm.entrySet()) 
            {
              // int prev = ite.get(0); 
              if(ite.getValue() != prev) 
              {
                List<String> temp = ans;
                Collections.sort(temp);
                for(String it: temp)
                    result.add(it);
                  
                 ans.clear();
                prev = ite.getValue();
              }

             ans.add(ite.getKey());
            }
    
        Collections.sort(ans);
        for(String it: ans)
            result.add(it);
        
        List<String> final_result = new ArrayList<>();
        for(String it: result)
        {
            if(k==0)
                break;
            final_result.add(it);
            k--;
        }
        return final_result;
    }
}