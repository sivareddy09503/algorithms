//Count the number of consistent strings
//TC:O(n), SC:O(n)
/*Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'*/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch:allowed.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        boolean flag;
        for(String word:words) {
            flag=true;
            for(char ch:word.toCharArray()) {
                if(!set.contains(ch)) {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}