//Count the digits that divide a number
//TC:O(n), SC:O(1)
//Input: num = 121
//Output: 2
/*Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.*/
class Solution {
    public int countDigits(int num) {
        int count = 0;
        int n=num;
        while(num!=0) {
            int k = num%10;
            if(n%k ==0) count++;
            num = num/10;
        }
        return count;
    }
}