//Delete characters to make fancy string
//TC:O(n), SC:O(1)
//Input: s = "leeetcode"
//Output: "leetcode"
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev1 = 'A', prev2 = 'A';
        for(char curr:s.toCharArray()) {
            if(prev1!=curr || prev2!=curr) {
                sb.append(curr);
                prev1 = prev2;
                prev2 = curr;
            }
        }
        return sb.toString();
    }
}