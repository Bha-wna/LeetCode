class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gs = 0, cs = 0;
        for(int i = 0; i < gas.length; i++){
            gs += gas[i];
            cs += cost[i];
        }
        if(gs < cs)
            return -1;
        int sum = 0, index = 0;
        for(int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            if(sum < 0){
                index = i+1;
                sum = 0;
            }
        }
        return index;
    }
}