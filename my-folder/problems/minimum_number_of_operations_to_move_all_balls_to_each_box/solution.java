class Solution {
    public int[] minOperations(String boxes) {
       char arr[] = boxes.toCharArray();
        int[] answer = new int[arr.length]; int k=0;
        for(int i=0; i< arr.length; i++)
        {
           for(int j=0; j<arr.length; j++)
           {
              
               if(arr[j]=='1' && i!= j)
               {
                 if(j >i)  
                 {
                     answer[i] = answer[i] +  j-i;
                    // answer[i] = answer[i] +k; 
                 }
                 else
                 {   
                     answer[i] = answer[i] + i-j;
                    // answer[i] = answer[i] +k;
                 }
                   
               }
               
             //  k=  answer[i]  ;
           }   
               
           }
           return answer;   
        }
          
    }
