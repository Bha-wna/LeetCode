class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long)length*width*height;
        int val = 10000;
        String ans1 = "";
        String ans2 ="";
        String fans ="";
    

        if(mass >= 100)
        { ans2 = "Heavy";
          fans ="Heavy"; 
        }
        if(volume >= (int)1e9 || length >= val || width >= val || height >= val)
        { ans1 = "Bulky";
          fans ="Bulky";
         
        }
        
        if(ans1.equals("Bulky") && ans2.equals("Heavy"))
        {  
            fans = "Both";
        }
        if(!ans1.equals("Bulky") && !ans2.equals("Heavy"))
            fans = "Neither";
      
       return fans; 
    }
}