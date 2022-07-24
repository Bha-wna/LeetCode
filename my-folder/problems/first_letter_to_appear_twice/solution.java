import java.util.Map.Entry;
class Solution {
    public char repeatedCharacter(String s) {
        Map <Character,Integer> m = new HashMap<>();
        int min = Integer.MAX_VALUE;
        char c ='1';
        int j=0,k=0;
        for(int i=0; i<s.length(); i++)
        {   if(j==2 ||k==1)
              break;
            if(!m.containsKey(s.charAt(i)))
                m.put(s.charAt(i),i);
            else
            {  j++;
                m.put(s.charAt(i), i);
                k++;
               min = Math.min(min,m.get(s.charAt(i)));
            }
        }
        System.out.println(min);
        System.out.println(m.entrySet());
        for(Entry<Character, Integer> entry: m.entrySet()) {
             if(entry.getValue() == min) 
             {  c= entry.getKey();
                System.out.println(c);
                break;
             }
      }
                              
    // public <K, V> K getKey(Map<K, V> map, V value) {   
    // for (Entry<K, V> entry : m.entrySet()) {
    //     if (entry.getValue().equals(min)) {
    //         return entry.getKey();
    //     }
    // } 
    // }
        return c;
    }                             
}
 