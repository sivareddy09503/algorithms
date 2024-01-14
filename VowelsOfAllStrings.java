//Vowels of all substrings
//TC:O(n), SC:O(1)
/*Input: word = "aba"
Output: 6
Explanation: 
All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
- "b" has 0 vowels in it
- "a", "ab", "ba", and "a" have 1 vowel each
- "aba" has 2 vowels in it
Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6*/
class Solution {
    public long countVowels(String word) {
            long count = 0;
            int len = word.length();
            for(int pos = 0; pos<len;pos++) {
                if(isVowel(word.charAt(pos))) {
                    count += (long) (len-pos) * (long) (pos+1);
                }
            }
            return count;
    }
    public boolean isVowel(char ch) {
        return ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}