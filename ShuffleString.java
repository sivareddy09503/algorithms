//Shuffle string
//TC:O(n), SC:O(1)
/*Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling*/
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for(int i=0;i<indices.length;i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}