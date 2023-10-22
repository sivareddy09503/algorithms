//Increasing Triplet Subsequence
//TC:O(n), SC:O(1)
//Input: nums = [1,2,3,4,5]
//Output: true
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n<=max1) max1 = n;
            else if(n<=max2) max2 = n;
            else return true;
        }
        return false;
    }
}