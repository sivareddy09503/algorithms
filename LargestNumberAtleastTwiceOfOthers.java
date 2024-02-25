//Largest number at least twice of others
//TC:O(n), SC:O(1)
/*Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.*/
class Solution {
    public int dominantIndex(int[] nums) {
        int big = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>big) {
                big = nums[i];
                idx = i;
            }
        }
        for(int i: nums) {
            if(i!=big && i*2>big) return -1;
        }
        return idx;
    }
}