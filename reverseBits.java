//Reverse Bits
//TC:O(1), SC:O(1)
//Input: n = 00000010100101000001111010011100
//Output:    964176192 (00111001011110000010100101000000)
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=1;i<=32;i++) {
            ans = ans<<1;
            ans = ans | (n&1);
            n = n>>1;
        }
        return ans;
    }
}