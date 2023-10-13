//Number of 1 bits
//TC:O(1),SC:O(1)
//Input: n = 00000000000000000000000000001011
//Output: 3
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while(n!=0){
            result = result + (n&1);
            n = n>>>1;
        }
        return result;
    }
}