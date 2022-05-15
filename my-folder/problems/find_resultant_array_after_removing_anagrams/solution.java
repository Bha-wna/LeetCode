class Solution {
    public List<String> removeAnagrams(String[] words) {
       ArrayList <String> al = new ArrayList<>();
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String s: words)
        {
           char tempArray[] = s.toCharArray();
           Arrays.sort(tempArray,0,tempArray.length);
           String temp= Arrays.toString(tempArray);
           if(!hm.containsKey(temp)) 
           {  hm.clear();
              hm.put(temp,1);
              al.add(s); 
           }
        }
        return al;
    }
}