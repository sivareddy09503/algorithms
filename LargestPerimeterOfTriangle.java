//Largest perimeter triangle
//TC:O(nlogn),SC:O(1)
//Input: nums = [2,1,2]
//Output: 5
class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int k=n-1;k>=2;k--) {
            int c = nums[k];
            int b = nums[k-1];
            int a = nums[k-2];
            if(isValid(a,b,c)) {
                return a+b+c;
            }
        }
        return 0;
    }
    public boolean isValid(int a,int b, int c) {
        return a+b>c;
    }
}