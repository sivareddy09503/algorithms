//Maximum number of words found in sentences
//TC:O(n), SC:O(1)
//Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//Output: 6
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String currSent:sentences) {
            int currLen = currSent.split(" ").length;
            if(currLen>maxWords) {
                maxWords = currLen;
            }
        }
        return maxWords;
    }
}