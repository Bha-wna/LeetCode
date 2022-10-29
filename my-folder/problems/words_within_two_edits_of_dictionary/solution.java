class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
//         List<String> dict = new ArrayList<>();
//         List<String> ans = new ArrayList<>();
        
//         for(int i=0; i<dictionary.length; i++)
//         {
//             dict.add(dictionary[i]);
//         }
//         for(int i=0; i<queries.length; i++)
//         {
//            String temp = queries[i];
//             for(int j=0; j<temp.length(); j++)
//             {
//             for(char ch ='a'; ch<= 'z'; ch++)
//             {   
//                char [] arr = temp.toCharArray();
//                arr[j] = ch;
//                for(int k=0; k<temp.length(); k++)
//                {
//                 for(char ch1 ='a'; ch1<= 'z'; ch1++)
//                 {   arr[k] = ch1;
//                     String word = new String(arr);
//                     if(dict.contains(word) && !ans.contains(word))
//                         ans.add(temp);
//                 }
//                   }
//             }
//             }
            
//         }
//         return ans;
        List<String> v = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();;
        
        for(String it: dictionary){
            m.put(it,1);
        }
        
        for(String it: queries){
            if(m.containsKey(it)){
                v.add(it);
                continue;
            }
            for(String it1: dictionary){
                int count = 0;
                for(int i = 0; i < it.length(); i++){
                    if(it1.charAt(i) != it.charAt(i))
                        count++;
                }
                if(count <= 2){
                    v.add(it);
                    break;
                }
            }
        }
        return v;
    }
}