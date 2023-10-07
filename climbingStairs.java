//Climbing stairs using DP
//TC:O(n), SC:O(1)
//Input: n = 2
//Output: 2
class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        if(n==2) return 2;
        int prev1=1,prev2=2,ways=0;
        for(int i=3;i<=n;i++) {
            ways = prev1+prev2;
            prev1 = prev2;
            prev2 = ways;
        }
        return ways;
    }
}