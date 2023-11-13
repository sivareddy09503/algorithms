//Generate a string with characters that have odd counts
//TC:O(n), SC:O(1)
//Input: n = 4
//Output: "pppz"
class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        if(n%2==0) {
            s.append("a".repeat(n-1));
            s.append("b");
        } else {
            s.append("a".repeat(n));
        }
        return s.toString();
    }
}