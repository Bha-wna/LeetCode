class Solution {
    public int minSteps(String s, String t) {
       int count =0;
        int [] arr = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            arr[s.charAt(i)-'a']++ ;
        }
        
        for(int j=0; j<t.length(); j++)
        {
            arr[t.charAt(j)-'a']-- ;
        }
        
        for(int i=0; i<arr.length; i++)
        {
            count = count + Math.abs(arr[i]);
        }
        return count;
    }
}