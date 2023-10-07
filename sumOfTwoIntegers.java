//Sum of two integers without using + and -
//TC:O(1), SC:O(1)
//Input: a = 1, b = 2
//Output: 3
class Solution {
    public int getSum(int a, int b) {
        int xor = a^b;
        int carry = a&b;
        if(carry == 0) {
            return xor;
        } else {
            return getSum(xor, carry<<1);
        }
    }
}