//Excel column number
//TC:O(n), SC:O(1)
//Input: columnTitle = "AB"
//Output: 28
class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null) return -1;
        int result = 0;
        for(char ch:columnTitle.toUpperCase().toCharArray()) {
            result *= 26;
            result += ch - 'A'+1;
        }
        return result;
    }
}