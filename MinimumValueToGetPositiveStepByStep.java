//Minimum value to get positive step by step sum
//TC:O(n), SC:O(1)
/*Input: nums = [-3,2,-3,4,2]
Output: 5
Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
step by step sum
startValue = 4 | startValue = 5 | nums
  (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
  (1 +2 ) = 3  | (2 +2 ) = 4    |   2
  (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
  (0 +4 ) = 4  | (1 +4 ) = 5    |   4
  (4 +2 ) = 6  | (5 +2 ) = 7    |   2*/
class Solution {
    public int minStartValue(int[] nums) {
        int min=0, sum=0;
        for(int a:nums) {
            sum +=a;
            if(sum<min) min = sum;
        }
        if(min<0) return 1+(-min);
        return 1;
    }
}