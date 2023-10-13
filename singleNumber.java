//Single Number
//TC:O(n), SC:O(1)
//Input: nums = [4,1,2,1,2]
//Output: 4
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length;i++) {
            result ^= nums[i];
        }
        return result;
    }
}