class Solution {
    public String reverseWords(String s) {
        
    Stack <String> st = new Stack<>();
        String ans = "";

        int len = s.length();
        String temp ="";
        for(int i=0; i<len; i++)
        { 
           if(s.charAt(i) !=' ')
           {   
               temp += s.charAt(i);
               if(i == len-1)
                   st.push(temp);
           }
           else if(temp != "")
           {   st.push(temp);
               temp = "";
           }
        }
        System.out.println(st);
         while(!st.isEmpty())
         {
            ans += st.pop() + " ";
         }
       // System.out.println(ans);
        return ans.substring(0,ans.length()-1);
       // return ans;
  }
}