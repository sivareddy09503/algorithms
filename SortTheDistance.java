//Sorting the sentence
//TC:O(n), SC:O(1)
//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];
        for(String word:words) {
            int index = Character.getNumericValue(word.charAt(word.length()-1))-1;
            bucket[index] = word.substring(0,word.length()-1);
        }
        return String.join(" ", bucket);
    }
}