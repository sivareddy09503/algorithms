//Power of Four
//TC:O(1), SC:O(1)
//Input: n = 16
//Output: true
class Solution {
    public boolean isPowerOfFour(int n) {
        return (n>0) && ((n&n-1) == 0) && (n-1)%3==0;
    }
}