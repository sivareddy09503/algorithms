//Find Pivot Index
//TC:O(n), SC:O(1)
//Input: nums = [1,7,3,6,5,6]
//Output: 3
class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int leftSum = 0, rightSum = 0;
        for(int i:nums) {
            rightSum += i;
        }
        for(int i=0;i<nums.length;i++) {
            rightSum -= nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}