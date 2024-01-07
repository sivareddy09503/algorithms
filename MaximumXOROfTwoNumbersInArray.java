//Maximum XOR of two numbers in an array
//TC:O(n), SC:O(n)
/*Input: nums = [3,10,5,25,2,8]
Output: 28
Explanation: The maximum result is 5 XOR 25 = 28*/
class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxRes = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=31;i>=0;i--) {
            set.clear();
            int currMax = (maxRes<<1) +1;
            int j;
            for(j=0;j<nums.length;j++) {
                int currNum = nums[j]>>i;
                set.add(currNum);
                if(set.contains(currMax^currNum)) {
                    maxRes = currMax;
                    break;
                }
            }
            if(j==nums.length) {
                maxRes = maxRes<<1;
            }
        }
        return maxRes;
    }
}