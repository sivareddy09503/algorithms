//sort-array-by-parity
//TC:O(n), SC:O(n)
/*Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.*/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int i=0,k=0;
        while(i<nums.length) {
            if(nums[i]%2==0) {
                res[k] = nums[i];
                k++;
            }
            i++;
        }
        i=0;
        while(i<nums.length) {
            if(nums[i]%2!=0) {
                res[k] = nums[i];
                k++;
            }
            i++;
        }
        return res;
    }
}