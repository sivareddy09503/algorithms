//Integer Break
//TC:O(n), SC:O(1)
//Input: n = 2
//Output: 1
class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int result = 1;
        while(n>4) {
            result *= 3;
            n -= 3;
        }
        result *= n;
        return result;
    }
}