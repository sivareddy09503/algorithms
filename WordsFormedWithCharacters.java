//Find words that can be formed by characters
//TC:O(n), SC:O(1)
/*Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.*/
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for(int i=0;i<chars.length();i++) {
            count[chars.charAt(i)-'a']++;
        }
        int res = 0;
        for(String s:words) {
            if(canForm(s,count)) {
                res+=s.length();
            }
        }
        return res;
    }
    public boolean canForm(String word, int[] count) {
        int[] c = new int[26];
        for(int i=0;i<word.length();i++) {
            int x = word.charAt(i)-'a';
            c[x]++;
            if(c[x]>count[x]) {
                return false;
            }
        }
        return true;
    }
}