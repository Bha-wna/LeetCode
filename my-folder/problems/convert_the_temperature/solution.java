class Solution {
    public double[] convertTemperature(double celsius) {
        double d = 0.00000;
        double [] ans = new double[2];
        ans[0] = celsius + 273.15 + d;
        ans[1] = celsius*1.80 + 32.00 + d;
        return ans;
    }
}