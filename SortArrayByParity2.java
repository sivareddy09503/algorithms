//sort-array-by-parity-ii
//TC:O(n), SC:O(1)
/*Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.*/
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int oddIndex = 1,evenIndex = 0;
        for(int i=0;i<len;i++) {
            if(nums[i]%2==0) {
                result[evenIndex]=nums[i];
                evenIndex += 2;
            } else {
                result[oddIndex]=nums[i];
                oddIndex += 2;
            }
        }
        return result;
    }
}