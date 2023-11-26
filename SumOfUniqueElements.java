//Sum of unique elements
//TC:O(n), SC:O(1)
/*Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.*/
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] counts = new int[101];
        for(int num:nums) {
            counts[num]++;
        }
        for(int i=0;i<counts.length;i++) {
            if(counts[i]==1) sum +=i;
        }
        return sum;
    }
}