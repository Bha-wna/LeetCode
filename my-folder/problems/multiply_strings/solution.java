class Solution {
    public String multiply(String num1, String num2) {
        char [] c1 = num1.toCharArray();
        char [] c2 = num2.toCharArray();
        
        int[] n1 = new int[c1.length];
        int[] n2 = new int[c2.length];
        
        for(int i=0; i<c1.length; i++)
        {
            n1[i] = c1[i]-'0';
        }
        
        for(int i=0; i<c2.length; i++)
        {
            n2[i] = c2[i]-'0';
        }
        System.out.println(Arrays.toString(n1));
         System.out.println(Arrays.toString(n2));
        
        int[] product = new int[n1.length + n2.length];
        for(int i=0; i<n2.length; i++)
        {
            for(int j=0; j<n1.length; j++)
            {
                product[i+j] += n2[i]*n1[j];
            }
        }
        System.out.println(Arrays.toString(product));
        int carry =0;
        if(product.length >2)
        {
        for(int i= product.length-2; i>=0; i--)
        {  
            if(i==0)
            {
              product[i] = carry + product[i]; 
                break;
            }
           product[i] = carry + product[i];
            carry = product[i]/10; 
           product[i] = product[i]%10; 
            
        }
            System.out.println(Arrays.toString(product));
        }
        String ans ="";
       
        for(int i=0; i<product.length-1; i++)
        {
            ans += product[i];
        }
        if(ans.charAt(0)=='0')
            return "0";
        
        // long l = Long.valueOf(ans);
        // if(l ==0)
        //     return "0";
       //  System.out.println(Arrays.toString(product));
        return ans;
    }
}