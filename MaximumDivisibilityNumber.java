//Find the maximum divisibility score
//TC:O(n), SC:O(1)
/*Input: nums = [4,7,9,3,9], divisors = [5,2,3]
Output: 3
Explanation: The divisibility score for every element in divisors is:
The divisibility score of divisors[0] is 0 since no number in nums is divisible by 5.
The divisibility score of divisors[1] is 1 since nums[0] is divisible by 2.
The divisibility score of divisors[2] is 3 since nums[2], nums[3], and nums[4] are divisible by 3.
Since divisors[2] has the maximum divisibility score, we return it.*/
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
       int count = 0;
        int divisor = divisors[0];
        for(int i=0;i<divisors.length;i++) {
            int divs = 0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j]%divisors[i]==0) {
                    divs++;
                }
            }
            if(divs == count) {
                divisor = Math.min(divisor,divisors[i]);
            }
            if(divs>count) {
                count = divs;
                divisor = divisors[i];
            }
        }
        return divisor;
    }
}