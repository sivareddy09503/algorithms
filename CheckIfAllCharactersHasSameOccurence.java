//Check if all characters have equal number of occurences
//TC:O(n), SC:O(1)
/*Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.*/
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        int max=0;
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
        }
        for(int x:count) {
            max = Math.max(max,x);
        }
        for(int i=0;i<count.length;i++) {
            if((count[i]!=0) && (max!=count[i])) return false;
        }
        return true;
    }
}