//Reverse words in a string
//TC:O(1), SC:O(1)
//Input: s = "the sky is blue"
//Output: "blue is sky the"
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}