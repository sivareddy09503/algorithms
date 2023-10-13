//Shuffle an array
//TC:O(n), SC:O(n)
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++) {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n];
        }
        return arr;
    }
}