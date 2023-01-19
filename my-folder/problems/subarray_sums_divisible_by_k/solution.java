// class Solution {
//     public int subarraysDivByK(int[] A, int K) {
//         Map<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1);
//         int count = 0, sum = 0;
//         for(int a : A) {
//             sum = (sum + a) % K;
//             if(sum < 0) sum += K;  // Because -1 % 5 = -1, but we need the positive mod 4
//             count += map.getOrDefault(sum, 0);
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }
//         return count;
//     }
// }

class Solution{
 public int subarraysDivByK(int[] A, int K) {
        int[] count = new int[K];
        count[0] = 1;
        int prefix = 0, res = 0;
        for (int a : A) {
            prefix = (prefix + a % K + K) % K;
            res += count[prefix]++;
        }
        return res;
    }
}