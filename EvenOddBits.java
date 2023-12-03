//Number of even and odd bits
//TC:O(n), SC:O(1)
/*Input: n = 17
Output: [2,0]
Explanation: The binary representation of 17 is 10001. 
It contains 1 on the 0th and 4th indices. 
There are 2 even and 0 odd indices*/
class Solution {
    public int[] evenOddBit(int n) {
        int even =0, odd=0, count=0;
        while(n>0) {
            if(n%2!=0) {
                if(count%2==0) even++;
                else odd++;
            } 
            count++;
            n = n/2;
        }
        return new int[]{even,odd};
    }
}