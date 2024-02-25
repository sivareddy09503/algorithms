//count-equal-and-divisible-pairs-in-an-array
//TC-O(n^2), SC-O(1)
/*Input: nums = [3,1,2,2,2,1,3], k = 2
Output: 4
Explanation:
There are 4 pairs that meet all the requirements:
- nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
- nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
- nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
- nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.*/
class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int a=0;a<nums.length-1;a++) {
            for(int b=a+1;b<nums.length;b++) {
                if(nums[a]==nums[b]) {
                    if((a*b)%k==0) count++;
                }
            }
        }
        return count;
    }
}