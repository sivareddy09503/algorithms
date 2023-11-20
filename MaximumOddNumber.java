//Maximum Odd Binary Number
//TC:O(n), SC:O(1)
//Input: s = "010"
//Output: "001"
//Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='1') count++;
        }
        for(int i=0;i<s.length()-1;i++) {
            if(count>1) {
                sb.setCharAt(i,'1');
                count--;
            } else {
                sb.setCharAt(i,'0');
            }
        }
        sb.setCharAt(s.length()-1,'1');

        return sb.toString();
    }
}