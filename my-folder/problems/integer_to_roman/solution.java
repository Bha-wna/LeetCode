class Solution {
    public String intToRoman(int num) {
        int[] numeral = new int[13]; 
        String[] roman  = new String[13];
        
        numeral[0]=1;
        numeral[1] =4;
        numeral[2] = 5;
        numeral[3] = 9;
        numeral[4] = 10;
        numeral[5] = 40;
        numeral[6] = 50;
        numeral[7] = 90;
        numeral[8] = 100;
        numeral[9] = 400;
        numeral[10] = 500;
        numeral[11] = 900;
        numeral[12] = 1000;
        
        roman[0] = "I";
        roman[1] = "IV";
        roman[2] = "V";
        roman[3] = "IX";
        roman[4] = "X";
        roman[5] = "XL";
        roman[6] = "L";
        roman[7] = "XC";
        roman[8] = "C";
        roman[9] = "CD";
        roman[10] = "D";
        roman[11] = "CM";
        roman[12] = "M";
        
        
        String ans ="";
        for(int i=12; i>=0; i--)
        {
            int temp = num/numeral[i];
            num = num%numeral[i];
            for(int j=1; j<= temp; j++)
            {
               ans += roman[i]; 
            }
        }
        return ans;
        
    }
}