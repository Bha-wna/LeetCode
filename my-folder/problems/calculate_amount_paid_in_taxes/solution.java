class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double dollars =0;
        double taxSum =0;
        double p =100;
        
        for(int i=0; i<brackets.length; i++)
        {
            for(int j=0; j<1; j++)
            {
                if(i==0 )
                {
                    if(brackets[i][j] < income)
                    {
                        dollars += brackets[i][j];
                        taxSum += (brackets[i][j] * (brackets[i][j+1])*1.0)/(p*1.0);
                        System.out.println(taxSum);
                    }
                    else
                    { taxSum+= (income * (brackets[i][j+1])*1.0)/(p*1.0);
                       dollars += brackets[i][j];
                       System.out.println(taxSum);}
                }
                if(i>=1 )
                {
                    if((dollars + brackets[i][j] - brackets[i-1][j]) < income)
                    {
                        dollars += (brackets[i][j] - brackets[i-1][j]) ;
                        taxSum += ((brackets[i][j] - brackets[i-1][j])*(brackets[i][j+1])*1.0)/(p*1.0);
                          System.out.println(taxSum);
                    }
                    else if(dollars<income)
                    {  taxSum += ((income-dollars)*(brackets[i][j+1])*1.0)/(p*1.0);
                        dollars += income-dollars;
                       System.out.println(taxSum);
                    }
                    else
                    {
                        return taxSum;
                    }
                }
            }
        }
        return taxSum;
    }
}