//Sum of values at indices with k set bits
//TC:O(n), SC:O(1)
/*Input: nums = [5,10,1,5,2], k = 1
Output: 13
Explanation: The binary representation of the indices are: 
0 = 0002
1 = 0012
2 = 0102
3 = 0112
4 = 1002 
Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
Hence, the answer is nums[1] + nums[2] + nums[4] = 13*/
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.size();i++) {
            int count = 0;
            count = countKBits(i);
            if(count==k) sum += nums.get(i);
        }
        return sum;
    }
    public int countKBits(int i) {
        int count = 0;
        while(i>0) {
            count += i&1;
            i>>=1;
        }
        return count;
    }
}