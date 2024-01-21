//Four divisors problem
//TC:O(n^2), SC:O(1)
/*Input: nums = [21,4,7]
Output: 32
Explanation: 
21 has 4 divisors: 1, 3, 7, 21
4 has 3 divisors: 1, 2, 4
7 has 2 divisors: 1, 7
The answer is the sum of divisors of 21 only.*/
class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++) {
            int num = nums[i];
            int count = 0;
            int sumOfDivisors = 0;
            for(int j=1;j<=Math.sqrt(num);j++) {
                if(num%j==0) {
                    if(j*j==num) {
                        count++;
                        sumOfDivisors +=j;
                    } else {
                        count += 2;
                        sumOfDivisors += (j+(num/j));
                    }
                }
            }
            if(count == 4) {
                sum += sumOfDivisors;
            }
        }
        return sum;
    }
}