//Minimize xor
//TC:O(n), SC:O(1)
/*The binary representations of num1 and num2 are 0011 and 0101, respectively.
The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal*/
class Solution {
    public int minimizeXor(int num1, int num2) {
        int bit1 = Integer.bitCount(num1);
        int bit2 = Integer.bitCount(num2);
        if(bit1<bit2) {
            for(int i=bit1;i<bit2;i++) {
                num1 = num1 | (num1+1);
            }
        } else {
            for(int i=bit2;i<bit1;i++) {
                num1 = num1 & (num1-1);
            }
        }
        return num1;
    }
}