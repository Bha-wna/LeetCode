class Solution {
    public String reverseVowels(String s) {
        char [] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        
        char [] arr = s.toCharArray();
        int i =0;
        int j= arr.length-1;
        int i1 =-1;
        int i2 =-1;
        
        while(i<=j)
        {
            for(int  k=0; k<10; k++)
            {
                if(arr[i] == vowels[k])
                    i1 = k;
                if(arr[j] == vowels[k])
                    i2 = k;
            }
           if(i1 != -1 && i2 != -1)
           {
              // System.out.println(i + " " + j);
               arr[i] = vowels[i2];
               arr[j] = vowels[i1];
               i++; j--;
              // System.out.println(Arrays.toString(arr));
                            //  System.out.println(i + " " + j);
               i1 =-1;
               i2 =-1;
           }
            else if(i1 != -1)
                j--;
            else if(i2 !=-1)
                i++;
            else{
                i++; j--;
            }
        }
        String ans = new String(arr);
        return ans;
    }
}