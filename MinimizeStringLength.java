//Minimize string length
//TC:O(n), SC:O(n)
/*Input: s = "aaabc"
Output: 3
Explanation: In this example, s is "aaabc". We can start by selecting the character 'a' at index 1. We then remove the closest 'a' to the left of index 1, which is at index 0, and the closest 'a' to the right of index 1, which is at index 2. After this operation, the string becomes "abc". Any further operation we perform on the string will leave it unchanged. Therefore, the length of the minimized string is 3.*/
class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}