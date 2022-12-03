class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        
        //sort Map in descending order as per values
        String ans ="";
        
        LinkedHashMap<Character,Integer> sm = new LinkedHashMap<>();
        
        m.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
  .forEachOrdered(x -> sm.put(x.getKey(), x.getValue()));
        
      //  System.out.println(sm);
        for(Map.Entry<Character,Integer> entry : sm.entrySet())
        {
            for(int i=0; i<entry.getValue(); i++)
               ans+= entry.getKey();
        }
        
        return ans;
        
//         int[] arr = new int[m.size()];
//         int it=0;
//         for(Map.Entry<Character,Integer> entry : m.entrySet())
//         {
//             arr[it++] = entry.getValue();
//         }
        
//         Arrays.sort(arr);
//         for(int i=0; i<arr.length; i++)
//         {
//             ans += 
//         }
        
    }
}