class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> v = new ArrayList<>();

        if(p.length() > s.length())
            return v;

        int sizeP = p.length();
        
        int[] freqP = new int[26];
        for(int i = 0; i < sizeP; i++){
            freqP[p.charAt(i) - 'a']++;
        }
        
        int[] freqS = new int[26];
        for(int i = 0; i < sizeP; i++){
            freqS[s.charAt(i) - 'a']++;
        }

        boolean flag = true;
        for(int i = 0; i < 26; i++){
            if(freqP[i] != freqS[i]){
                flag = false;
                break;
            }
        }

        if(flag){
            v.add(0);
        }

        for(int i = sizeP; i < s.length(); i++){
            freqS[s.charAt(i-sizeP) - 'a']--;
            freqS[s.charAt(i)-'a']++;
            flag = true;
            for(int z = 0; z< 26; z++){
                if(freqP[z] != freqS[z]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                v.add(i - sizeP + 1);
            }
        }
        return v; 
    }
}
//         List<Integer> ans = new ArrayList<>();
//          int len = p.length();
//          char[] pmap = new char[26];
//          for(int i=0; i<p.length(); i++)
//          {
//              pmap[p.charAt(i)-'a']++;
//          } 

//          for(int j=0; j<=s.length()-len; j++)
//          {
//              int cnt=0;
//              String temp = s.substring(j,j+len);
//              System.out.println(temp);
//              char[] ch = new char[26];
//              for(int k=0; k<temp.length(); k++)
//              {
//                  ch[temp.charAt(k)-'a']++;
//              }
//              for(int i=0; i<ch.length; i++)
//              {
//                  if(pmap[i]!= ch[i])
//                    break;
//                  else 
//                    cnt++;  
//              }
//              if(cnt ==len)
//                ans.add(j);
//          }
//          return ans;
//     }
// }