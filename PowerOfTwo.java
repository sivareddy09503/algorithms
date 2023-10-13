//Power of Two
//TC:O(1), SC:O(1)
//Input: n = 16
//Output: true
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0) && ((n&n-1) == 0);
    }
}