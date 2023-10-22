//Difference between element sum and digit sum of an array
//TC:O(n), SC:O(1)
//Input: nums = [1,15,6,3]
//Output: 9
class Solution {
    public int differenceOfSum(int[] nums) {
        int result = 0;
        int elemSum = 0, digitSum = 0;
        for(int i=0; i<nums.length;i++) {
            elemSum += nums[i];
            digitSum +=digitsSum(nums[i]);
        }
        return elemSum - digitSum;
    }
    public int digitsSum(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        return sum;
    }
}