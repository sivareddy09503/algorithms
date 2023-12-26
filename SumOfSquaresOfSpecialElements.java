//Sum of squares of special elements
//TC:O(n), SC:O(1)
/*Input: nums = [1,2,3,4]
Output: 21
Explanation: There are exactly 3 special elements in nums: nums[1] since 1 divides 4, nums[2] since 2 divides 4, and nums[4] since 4 divides 4. 
Hence, the sum of the squares of all special elements of nums is nums[1] * nums[1] + nums[2] * nums[2] + nums[4] * nums[4] = 1 * 1 + 2 * 2 + 4 * 4 = 21*/
class Solution {
    public int sumOfSquares(int[] nums) {
        int result = 0, n = nums.length;
        for(int i=0;i<n;i++) 
            if(n%(i+1)==0)
                result += nums[i] * nums[i];
        return result;
    }
}