//Reverse vowels of a string
//TC:O(n), SC:O(1)
//Input: s = "hello"
//Output: "holle"
class Solution {
    public String reverseVowels(String s) {
        if(s==null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start =0, end = s.length()-1;
        while(start<end) {
            while(start<end && !vowels.contains(chars[start]+"")) {
                start++;
            }
            while(start<end && !vowels.contains(chars[end]+"")) {
                end--;
            }
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}