//Maximum Average Subarrray
//TC:O(n), SC:O(1)
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for(int i=0;i<k;i++) {
            sum += nums[i];
        }
        long max = sum;
        for(int i=k;i<nums.length;i++) {
            sum += nums[i] - nums[i-k];
            max = Math.max(sum,max);
        }
        return max/1.0/k;
    }
}