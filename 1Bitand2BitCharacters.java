//1-bit and 2-bit characters
//TC:O(n), SC:O(1)
/*Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.*/
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        int n = bits.length;
        for(int i=n-2;i>=0&&bits[i]!=0;i--) {
            count++;
        }
        return (count%2==0);
    }
}