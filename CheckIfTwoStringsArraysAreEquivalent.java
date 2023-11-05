//Check If two string arrays are equivalent
//TC:O(n), SC:O(1)
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st1 = "", st2 = "";
        for(String str:word1) st1 += str;
        for(String str:word2) st2 += str;
        return st1.equals(st2);
    }
}