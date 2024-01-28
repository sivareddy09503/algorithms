//Check if bitwise or has trailing zeros
//TC:O(n), SC:O(1)
/*Input: nums = [1,2,3,4,5]
Output: true
Explanation: If we select the elements 2 and 4, their bitwise OR is 6, which has the binary representation "110" with one trailing zero.*/
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even = 0;
        for(int n:nums) {
            even += (n%2==0)?1:0;
        }
        return (even>=2);
    }
}