//XOR Operation in an Array
//Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length
//TC:O(n), SC:O(1)
//Input: n = 5, start = 0
//Output: 8
class Solution {
    public int xorOperation(int n, int start) {
        int result = start;
        for(int i=1;i<n;i++){
            result ^= start+2*i;
        }
        return result;
    }
}