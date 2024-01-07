//Average value of even numbers that are divisible by three
//TC:O(n), SC:O(1)
/*Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9*/
class Solution {
    public int averageValue(int[] nums) {
        int res = 0, count = 0;
        for(int num:nums) {
            if(num%2==0 && num%3==0) {
                res += num;
                count++;
            }
        }
        if(res==0) return 0;
        return res/count;
    }
}