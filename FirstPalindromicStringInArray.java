//Find the first palindromic string in the array
//TC:O(mn), SC:O(1)
//Input: words = ["abc","car","ada","racecar","cool"]
//Output: "ada"
class Solution {
    public String firstPalindrome(String[] words) {
        for(String x:words) {
            if(isPalindrome(x)) {
                return x;
            }
        }
        return "";
    }
    public boolean isPalindrome(String str) {
        int i = str.length()/2;
        int j = (str.length()-1)/2;
        while(i>=0) {
            if(str.charAt(i--) != str.charAt(j++)) return false;
        }
        return true;
    }
}