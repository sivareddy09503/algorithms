//binary number with alternating bits
//TC:O(n), SC:O(1)
/*Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101*/
class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        char prev = s.charAt(0);
        for(int i=1;i<s.length();i++) {
            int x = Character.compare(prev, s.charAt(i));
            if(x==0) return false;
            prev = s.charAt(i);
        }
        return true;
    }
}