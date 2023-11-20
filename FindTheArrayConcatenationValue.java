//find the array concatenation value
//TC:O(n), SC:O(1)
/*Input: nums = [7,52,2,4]
Output: 596
Explanation: Before performing any operation, nums is [7,52,2,4] and concatenation value is 0.
 - In the first operation:
We pick the first element, 7, and the last element, 4.
Their concatenation is 74, and we add it to the concatenation value, so it becomes equal to 74.
Then we delete them from nums, so nums becomes equal to [52,2].
 - In the second operation:
We pick the first element, 52, and the last element, 2.
Their concatenation is 522, and we add it to the concatenation value, so it becomes equal to 596.
Then we delete them from the nums, so nums becomes empty.
Since the concatenation value is 596 so the answer is 596.*/
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        long sum = 0;
        while(low<high) {
            String str = nums[low] +""+ nums[high];
            sum += Integer.parseInt(str);
            low++;
            high--;
        }
        if(nums.length%2!=0) sum += nums[low];
        return sum;
    }
}