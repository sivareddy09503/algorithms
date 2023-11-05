//Sum of Digits in Base K
//TC:O(n), SC:O(1)
//Input: n = 34, k = 6
//Output: 9
class Solution {
    public int sumBase(int n, int k) {
        int result = 0;
        while(n>0) {
            int rem = n%k;
            result += rem;
            n = n/k;
        }
        return result;
    }
}