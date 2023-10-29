//Sign of the Produc of an Array
//TC:O(n), SC:O(1)
//Input: nums = [-1,-2,-3,-4,3,2,1]
//Output: 1
class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) return 0;
            if(nums[i]<0) neg++;
        }
        if((neg%2)!=0) return -1;
        else return 1;

    }
}