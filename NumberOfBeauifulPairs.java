//Number of beautiful pairs
//TC:O(n), SC:O(1)
/*Input: nums = [2,5,1,4]
Output: 5
Explanation: There are 5 beautiful pairs in nums:
When i = 0 and j = 1: the first digit of nums[0] is 2, and the last digit of nums[1] is 5. We can confirm that 2 and 5 are coprime, since gcd(2,5) == 1.
When i = 0 and j = 2: the first digit of nums[0] is 2, and the last digit of nums[2] is 1. Indeed, gcd(2,1) == 1.
When i = 1 and j = 2: the first digit of nums[1] is 5, and the last digit of nums[2] is 1. Indeed, gcd(5,1) == 1.
When i = 1 and j = 3: the first digit of nums[1] is 5, and the last digit of nums[3] is 4. Indeed, gcd(5,4) == 1.
When i = 2 and j = 3: the first digit of nums[2] is 1, and the last digit of nums[3] is 4. Indeed, gcd(1,4) == 1.
Thus, we return 5*/
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int pairs = 0;
        for(int i=0; i<nums.length;i++) {
            int d = nums[i] % 10;
            for(int j=0;j<i;j++) {
                int n = nums[j];
                while(n>=10) {
                    n/=10;
                }
                pairs += gcd(n,d) == 1 ? 1:0;
            }
        }
        return pairs;
    }
    public int gcd(int x, int y) {
        while(y!=0) {
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        return x;
    }
}