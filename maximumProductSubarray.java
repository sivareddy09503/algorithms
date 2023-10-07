//Maximum Product Subarray using DP
//TC:O(n),SC:O(1)
//Input: nums = [2,3,-2,4]
//Output: 6
class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = Math.max(Math.max(nums[i],nums[i]*max),nums[i]*min);
            min = Math.min(Math.min(nums[i],nums[i]*max),nums[i]*min);
            max = temp;
            result = Math.max(result,max);
        }
        return result;
    }
}