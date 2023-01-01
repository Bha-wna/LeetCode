class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        Map<String, Character> m1 = new HashMap<>();
        char ch ='a';
     
        int n = arr.length;
        if(pattern.length() != n)
            return false;
        for(int i=0;i<n; i++)
        {
            m1.putIfAbsent(arr[i],ch++);
        }
        
        System.out.println(m1);
        String ans ="";
        for(int i=0; i<n; i++)
        {
            ans += m1.get(arr[i]);
        }
        System.out.println(ans);
        
         Map<Character, Character> m2 = new HashMap<>();
         char ch1 ='a';
        for(int i=0;i<n; i++)
        {
            m2.putIfAbsent(pattern.charAt(i),ch1++);
        }
        System.out.println(m2);
        String ans1 ="";
        for(int i=0; i<n; i++)
        {
            ans1 += m2.get(pattern.charAt(i));
        }
         System.out.println(ans1);
        
        return ans.equals(ans1);
    }
}