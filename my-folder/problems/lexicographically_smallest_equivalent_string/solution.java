class Solution {
    int representative[] = new int[26];

    // Returns the root representative of the component.
    int find(int x) {
        if (representative[x] == x) {
            return x;
        }

        return representative[x] = find(representative[x]);
    }

    // Perform union if x and y aren't in the same component.
    void performUnion(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) {
            return;
        }

        // Make the smaller character representative.
        if (x < y) {
            representative[y] = x;
        } else {
            representative[x] = y;
        }
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        // Make each character representative of itself.
        for (int i = 0; i < 26; i++) {
            representative[i] = i;
        }

        // Perform union merge for all the edges.
        for (int i = 0; i < s1.length(); i++) {
            performUnion(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        String ans = "";
        // Create the answer string with final mappings.
        for (char c : baseStr.toCharArray()) {
            ans += (char)(find(c - 'a') + 'a');
        }

        return ans;
    }
}
// class Solution {
//     public String smallestEquivalentString(String s1, String s2, String baseStr) {
//         Map<Character, List<Character>> m = new HashMap<>();
        
//         for(int i=0; i<s1.length(); i++){
//             char ch1 = s1.charAt(i);
//             char ch2 = s2.charAt(i);
//             if(!m.containsKey(ch1) && !m.containsKey(ch2))
//             {   
//                 List<Character> temp1 = new ArrayList<>();
//                 temp1.add(ch2);
//                 m.put(ch1, temp1);
                
//                 List<Character> temp2 = new ArrayList<>();
//                 temp2.add(ch1);
//                 m.put(ch2, temp2);
//             }
//              else if(m.containsKey(ch1) && !m.containsKey(ch2))
//              {
//                  m.get(ch1).add(ch2);
//                  List<Character> temp1 = new ArrayList<>();
//                  temp1.add(ch1);
//                  m.put(ch2,temp1);
//                  for(char ch : m.get(ch1))
//                  {
//                     if(ch != ch2)
//                      m.get(ch).add(ch2);
//                  }
//                 // for(char ch : m.get(ch2))
//                 //  {
//                 //    for(char chh : m.get(ch))
//                 //    {
//                 //        if(chh != ch2)
//                 //          m.get(ch2).add(chh);
//                 //    }   
//                 // }
//              }
//           // else if(m.containsKey(ch2) && !m.containsKey(ch1))
//           //   {
//           //      // m.get(ch1).add(ch2);
//           //     List<Character> temp1 = new ArrayList<>();
//           //       temp1.add(ch2);
//           //       m.put(ch1,temp1);
//           //       for(char ch : m.get(ch2))
//           //       {
//           //           m.get(ch).add(ch1);
//           //       }
//           //       for(char ch : m.get(ch1))
//           //       {
//           //           m.get(ch).add(ch1);
//           //           m.get(ch1).add(ch);
//           //       }
//           //   }
//         }
//         System.out.println(m);
//         return "";
//     }
// }