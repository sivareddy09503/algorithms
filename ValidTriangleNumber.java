//Triangle number
//TC:O(n^3logn),SC:O(1)
//Input: nums = [2,2,3,4]
//Output: 3
class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(nums[i]+nums[j]>nums[k]) count++;
                }
            }
        }
        return count;
    }
}