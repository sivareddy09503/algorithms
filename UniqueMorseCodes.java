//Unique morse code words
//TC:O(n), SC:O(1)
/*Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".*/
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s:words) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++) {
                sb.append(str[s.charAt(i)-97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}