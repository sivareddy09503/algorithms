//find-resultant-array-after-removing-anagrams
//TC:O(nlogn), SC:O(1)
/*Input: words = ["abba","baba","bbaa","cd","cd"]
Output: ["abba","cd"]
Explanation:
One of the ways we can obtain the resultant array is by using the following operations:
- Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2].
  Now words = ["abba","baba","cd","cd"].
- Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1].
  Now words = ["abba","cd","cd"].
- Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2].
  Now words = ["abba","cd"].
We can no longer perform any operations, so ["abba","cd"] is the final answer.*/
class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> li = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String curr = String.valueOf(ch);
            if(!curr.equals(prev)) {
                li.add(words[i]);
                prev = curr;
            }  
        }
        return li;
    }
}