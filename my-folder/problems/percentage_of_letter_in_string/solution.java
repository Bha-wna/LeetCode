class Solution {
    public int percentageLetter(String s, char letter) {
        int count =0;
        for(int i=0; i<s.length(); i++)
        {
            if(letter == s.charAt(i))
                count++;
        }
       // System.out.println(count);
        int len = s.length();
       // System.out.println(len);
        int ans = (count *100)/len ;
       // System.out.println(ans);//*100;
        return ans;
    }
}