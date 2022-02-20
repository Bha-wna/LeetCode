class Solution {
    public int countEven(int num) {
         int count =0;
        int rem =0;
        int res =0;
        int i=2;
        while(num>=i) {
            int temp = i;
            while (temp != 0) {
                rem = temp % 10;
                res += rem;
                temp = temp/10;

            }
            if (res % 2 == 0)
                count++;
            i++;
            res = 0;
        }
        return count;
    }
}