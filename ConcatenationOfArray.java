//Concatenation of Array
//TC:O(n), SC:O(n)
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int count = nums.length;
        for(int i=0;i<nums.length;i++) {
            result[i] = nums[i];
            result[count+i] = nums[i];
        }
        return result;
    }
}