//Fibonaaci number using DP
class Solution {
    int[] dp = new int[31];
    public int fib(int n) {
        //Fibonacci number using bottom up approach DP
        //TC:O(n), SC:O(n)
        /*if(n<=1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];*/
        //Fibonacci number using top down approach DP
        //TC:O(n), SC:O(n)
        /*if(n<=1) return n;
        if(n==2) return 1;
        memorize(n);
        return dp[n];*/
        //Fibonacci number using bottom u approach DP
        //TC:O(n), SC:O(1)
        if(n<=1) return n;
        if(n==2) return 1;
        int prev1=1, prev2=1,curr=0;
        for(int i=3;i<=n;i++){
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    }
    public int memorize(int n){
        if(dp[n]!=0) return dp[n];
        if(n<3){
            return 1;
        } else {
            dp[n] = memorize(n-2)+memorize(n-1);
        }
        return dp[n];
    }
}