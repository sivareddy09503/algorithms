//Redistribute characters to make all strings equal
//TC:O(mn), SC:O(1)
/*Input: words = ["abc","aabc","bc"]
Output: true
Explanation: Move the first 'a' in words[1] to the front of words[2],
to make words[1] = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return true*/
class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1) {
            return true;
        }
        int countChars = 0;
        for(String str: words) {
            countChars += str.length();
        }
        if(countChars % words.length != 0) {
            return false;
        }
        int[] map = new int[26];
        for(String str:words) {
            for(char c:str.toCharArray()) {
                map[c-'a']++;
            }
        }
        for( int i:map) {
            if(i%words.length!=0) {
                return false;
            }
        }
        return true;
    }
}