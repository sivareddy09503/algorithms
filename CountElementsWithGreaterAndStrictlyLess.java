//Count elementns with strictly smaller and greater elements
//TC:O(n), SC:O(1)
/*Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.*/
class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        if(n<3) return 0;
        int[] arr = minmax(nums);
        int min = arr[0];
        int max = arr[1];
        int c = 0;
        for(int i=0;i<n;i++) {
            if(nums[i]!=min && nums[i]!=max) c++;
        }
        return c;
    }
    public int[] minmax(int[] arr) {
        int[] ans = new int[2];
        int max = arr[0], min = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}