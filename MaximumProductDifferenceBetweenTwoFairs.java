//Max product difference between two pairs
//TC:O(n), SC:O(1)
//Input: nums = [5,6,2,7,4]
//Output: 34
class Solution {
    public int maxProductDifference(int[] nums) {
        /*Arrays.sort(nums);
        int len = nums.length;
        return nums[len-1]*nums[len-2] - nums[0]*nums[1];*/
        int max2= 0, max = 0;
        int min2 = 10001, min = 10001; //given condition 1<=nums[i]<=10000
        for(int i:nums) {
            if(max<i) {
                max2 = max;
                max = i;
            } else if(max2<i) {
                max2 = i;
            }
            if(min>i) {
                min2 = min;
                min = i;
            } else if(min2>i) {
                min2 = i;
            }
        }
        return max2*max - min2*min;
    }
}