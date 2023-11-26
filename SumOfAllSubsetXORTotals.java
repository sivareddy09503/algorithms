//Sum of all subset xor totals
//TC:O(n!), SC:O(n)
/*Input: nums = [1,3]
Output: 6
Explanation: The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6*/
class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    public int helper(int[] nums, int index, int currentXOR) {
        if(index==nums.length) return currentXOR;
        int withElement = helper(nums,index+1,currentXOR^nums[index]);
        int withoutElement = helper(nums, index+1, currentXOR);
        return withElement + withoutElement;
    }
}