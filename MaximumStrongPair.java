//Maximum strong pair
//TC:O(n^2), SC:O(1)
//Input: nums = [1,2,3,4,5]
//Output: 7
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for(int x:nums) {
            for(int y:nums) {
                if(Math.abs(x-y)<=Math.min(x,y)) {
                    ans = Math.max(ans,x^y);
                }
            }
        }
        return ans;
    }
}