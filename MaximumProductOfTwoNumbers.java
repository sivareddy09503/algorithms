//Maximum product of word lengths
//TC:O(1), SC:O(1)
/*Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn".*/
class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        for(int i=0;i<n;i++) {
            for(char c:words[i].toCharArray()) {
                masks[i] |= (1<<(c-'a'));
            }
        }
        int largest = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if((masks[i] & masks[j])==0) {
                    largest = Math.max(largest, words[i].length()*words[j].length());
                }
            }
        }
        return largest;
    }
}