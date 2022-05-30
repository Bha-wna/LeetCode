class Solution {
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public String discountPrices(String sentence, int discount) {
        
        String strArray[] = sentence.split(" ");
        for(int i=0; i<strArray.length; i++)
        {
            if(strArray[i].charAt(0) == '$')
            { 
                boolean flag = true;
                if(strArray[i].length() > 1){
                    for(int j = 1; j < strArray[i].length(); j++)
                    {
                        if(strArray[i].charAt(j) == '$' || !Character.isDigit(strArray[i].charAt(j))){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println(strArray[i]);
                        double value = Double.parseDouble(strArray[i].substring(1));
                        double disc_percent = value-(value/100)*discount;
                        strArray[i] = "$" + df.format(disc_percent) ;
                    }
                }
            }
        }
        String newString = Arrays.toString(strArray) ;
        newString = newString.substring(1,newString.length()-1);
       // String regex = null;
        newString = newString.replaceAll(",","");
        return newString;
    }
}