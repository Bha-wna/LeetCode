class Solution {
    public int countAsterisks(String s) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
        
      for(int i=0; i<s.length(); i++)
      {
         if(s.charAt(i)=='|') 
             arr.add(i);
      }
       
       System.out.println(arr); 
       int count =0; 
       
        int idx=0;
        while(idx < s.length() && s.charAt(idx) !='|'  )
        {
            if(s.charAt(idx)=='*')
                count++;
            idx++;
        }
        
       for(int j=1;j<arr.size();j= j+2)
       {  
          String temp =""; 
          if(j+1 < arr.size())
           temp = s.substring(arr.get(j),arr.get(j+1)+1); 
           System.out.println(temp);
         for(int k=0; k < temp.length(); k++) 
         {
             if(temp.charAt(k)=='*')
                 count++;
         }
           System.out.println(count);
      }
        if(arr.size()>=1)
        {
        int c = arr.get(arr.size()-1);
        while( c< s.length())
        {
            if(s.charAt(c)=='*')
                count++;
            c++;
        } 
        }
   //   if(arr.size()%2==0 && )  
        
         System.out.println(count);
      return count;     
    }
}