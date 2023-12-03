//Find gcd of array
//TC:O(n), SC:O(1)
/*Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2*/
class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int num: nums) {
            max = (num>max)?num:max;
            min = (num<min)?num:min;
        }
        return gcd(max,min);
    }
    public int gcd(int a, int b) {
        if(a==0||b==0) return a^b;
        if(b>a) return gcd(b,a);
        return gcd(a%b,b);
    }
}