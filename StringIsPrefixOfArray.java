//Check If String Is a Prefix of Array
//TC:O(n), SC:O(1)
//Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
//Output: true
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String str:words) {
            sb.append(str);
            if(sb.toString().equals(s)) return true;
        }
        return false;
    }
}