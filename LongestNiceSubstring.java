//Longest nice substring
//TC:O(n^2), SC:O(n^2)
/*Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.*/
class Solution {
    public String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for(Character c:s.toCharArray()) {
            set.add(c);
        }
        for(int i=0;i<s.length();i++) {
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))) continue;
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length()>=s2.length() ? s1 : s2;
        }
        return s;
    }
}