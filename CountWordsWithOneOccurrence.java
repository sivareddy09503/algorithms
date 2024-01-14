//Count common words with one occurence
//TC:O(n), SC:O(n)
/*Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
Output: 2
Explanation:
- "leetcode" appears exactly once in each of the two arrays. We count this string.
- "amazing" appears exactly once in each of the two arrays. We count this string.
- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
- "as" appears once in words1, but does not appear in words2. We do not count this string.
Thus, there are 2 strings that appear exactly once in each of the two arrays.*/
class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        int count =0;
        for(String word:words1) {
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        for(String word:words2) {
            map2.put(word,map2.getOrDefault(word,0)+1);
        }
        for(String word:words1) {
            if(map1.get(word)==1 && map2.getOrDefault(word,0)==1)
                count++;
        }
        return count;
    }
}