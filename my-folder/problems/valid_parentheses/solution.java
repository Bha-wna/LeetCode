class Solution {
 public boolean isValid(String s) {
 Stack<Character> st = new Stack<>();
 int i=0;
 while(i<s.length())
 { 
    if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
       {
            st.push(s.charAt(i));
            i++;
       }   
   else
    {   
       if(st.empty()==true)
             return false;
        if(st.peek()=='(')
        {  
            if(s.charAt(i) == ')')
            { st.pop();
              i++;
            }
            else
                return false;
        }    
         else if(st.peek()== '{')
         {  
            if(s.charAt(i) == '}')
            {  st.pop();
                i++;
            }
            else
                return false;
         }
          
        else  if(st.peek()== '[')
        {
            if(s.charAt(i)==']')
            {  st.pop();
                i++;
            }
            else
                return false;
        }    
     }
    
}
    if(st.empty()==true)
            return true;
          else
              return false;
    }
}