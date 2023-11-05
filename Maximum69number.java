//Maximum number by replacing 1 digit
//TC:O(logn), SC:O(n)
//Input: num = 9669
//Output: 9969
class Solution {
    public int maximum69Number (int num) {
        StringBuilder s = new StringBuilder(""+num);
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='6') {
                s.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(s.toString());
    }
}