//Missing Number
//TC:O(n),SC:O(1)
//Input: nums = [3,0,1]
//Output: 2
class Solution {
    public int missingNumber(int[] nums) {
        /*int targetSum = 0, actualSum = 0;
        for(int i=0;i<=nums.length;i++) targetSum += i;
        for(int i=0;i<nums.length;i++) actualSum += nums[i];
        return targetSum-actualSum;*/
        int result = nums.length;
        for(int i=0;i<nums.length;i++) {
            result ^= i;
            result ^= nums[i]; 
        }
        return result;
    }
}