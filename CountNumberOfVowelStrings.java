//count-the-number-of-vowel-strings-in-range
//TC:O(n), SC:O(1)
/*Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.*/
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++) {
            if(isVowel(words[i].charAt(0))&&isVowel(words[i].charAt(words[i].length()-1))) {
                count++;
            }
        }
        return count;
    }
    public boolean isVowel(char c) {
        return c=='a'|| c=='e'||c=='i'||c=='o'||c=='u';
    }
}