class MaximumSubArray {
    //Maximum Subarray
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    //TC:O(n), SC:O(1)
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for(int i=1 ; i<nums.length; i++) {
            curr = Math.max(nums[i],nums[i]+curr);
            max = Math.max(max, curr);
        }
        return max;
    }
}