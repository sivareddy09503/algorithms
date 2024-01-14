//Truncate sentence
//TC:O(n), SC:O(1)
/*Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you"*/
class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0, index = 0;
        for(index = 0;index<s.length();index++) {
            if(s.charAt(index)==' ')
                count++;
            if(count == k)
                break;
        }
        return s.substring(0,index);
    }
}