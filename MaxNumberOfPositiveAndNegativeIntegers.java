//maximum count of positive integer and negative integer
//TC:O(n), SC:O(1)
/*Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.*/
class Solution {
    public int maximumCount(int[] nums) {
        int negCount = 0, posCount = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) posCount++;
            if(nums[i]<0) negCount++;
        }
        return Math.max(negCount,posCount);
    }
}