class SubarraysProductLessThanK {
    //Subarray Product less than k
    //Input: nums = [10,5,2,6], k = 100
    //Output: 8
/*Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.*/
    //TC:O(n^2), SC:O(1)
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1, left = 0, count = 0;
        for(int right=0; right<nums.length;right++) {
            prod = prod * nums[right];
            while(right>=left && prod>=k) {
                prod = prod/nums[left];
                left++;
            }
            count = count + right - left + 1;
        }
        return count;
    }
}